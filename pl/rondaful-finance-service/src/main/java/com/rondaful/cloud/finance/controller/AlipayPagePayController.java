package com.rondaful.cloud.finance.controller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.domain.AlipayDataDataserviceBillDownloadurlQueryModel;
import com.alipay.api.domain.AlipayTradeCloseModel;
import com.alipay.api.domain.AlipayTradeFastpayRefundQueryModel;
import com.alipay.api.domain.AlipayTradePagePayModel;
import com.alipay.api.domain.AlipayTradeRefundModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayDataDataserviceBillDownloadurlQueryRequest;
import com.alipay.api.request.AlipayTradeCloseRequest;
import com.alipay.api.request.AlipayTradeFastpayRefundQueryRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.alipay.api.response.AlipayDataDataserviceBillDownloadurlQueryResponse;
import com.alipay.api.response.AlipayTradeCloseResponse;
import com.alipay.api.response.AlipayTradeFastpayRefundQueryResponse;
import com.alipay.api.response.AlipayTradeRefundResponse;
import com.rondaful.cloud.finance.enums.ProductCode;
import com.rondaful.cloud.finance.enums.ResponseCodeEnum;
import com.rondaful.cloud.finance.exception.GlobalException;
import com.rondaful.cloud.finance.utils.AlipayUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("alipay/page")
@Api("支付宝支付")
public class AlipayPagePayController {

	@PostMapping("gotoPayPage")
	@ApiOperation(value = "电脑支付请求", notes = "电脑支付请求")
//	String totalAmount, String productCode, 
	public void pagePayRequest(HttpServletRequest httpRequest,
			HttpServletResponse httpResponse) throws AlipayApiException, IOException {
		String totalAmount="0.01"; 
		String productCode="LOGISTICS_PAGE_PAY"; 
		if (ProductCode.valueOf(productCode) == null) {
			throw new GlobalException(ResponseCodeEnum.RETURN_CODE_100002.getCode(), "支付类型错误!");
		}

		String subject=ProductCode.valueOf(productCode).getSubject();
		
		// 订单模型
		AlipayTradePagePayModel model = new AlipayTradePagePayModel();
		model.setOutTradeNo(UUID.randomUUID().toString());
		model.setSubject(subject);
		model.setTotalAmount(totalAmount);
		model.setBody(subject+"，共"+totalAmount+"元");
		model.setProductCode("FAST_INSTANT_TRADE_PAY");

		AlipayTradePagePayRequest pagePayRequest = new AlipayTradePagePayRequest();
		pagePayRequest.setReturnUrl(AlipayUtil.RETURN_URL);// 同步跳转页面
		pagePayRequest.setNotifyUrl(AlipayUtil.NOTIFY_URL);// 异步通知页面
		pagePayRequest.setBizModel(model);

		// 调用SDK生成表单, 并直接将完整的表单html输出到页面
		AlipayClient alipayClient = AlipayUtil.getClient();
		String form = alipayClient.pageExecute(pagePayRequest).getBody();
		httpResponse.setContentType("text/html;charset=" + AlipayUtil.CHARSET);
		httpResponse.getWriter().write(form);
		httpResponse.getWriter().flush();
		httpResponse.getWriter().close();
	}

	@GetMapping("/returnUrl")
	public String returnUrl(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, AlipayApiException {
		response.setContentType("text/html;charset=" + AlipayUtil.CHARSET);

		boolean verifyResult = rsaCheckV1(request);
		if (verifyResult) {
			// 验证成功
			// 请在这里加上商户的业务逻辑程序代码，如保存支付宝交易号
			// 商户订单号
			String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");
			// 支付宝交易号
			String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

			return "pagePaySuccess";

		} else {
			return "pagePayFail";

		}
	}

	/**
	 * 支付异步通知
	 *
	 * 接收到异步通知并验签通过后，一定要检查通知内容，包括通知中的app_id、out_trade_no、total_amount是否与请求中的一致，并根据trade_status进行后续业务处理。
	 *
	 * https://docs.open.alipay.com/194/103296
	 */
	@RequestMapping("/notify")
	public String notify(HttpServletRequest request) throws AlipayApiException, UnsupportedEncodingException {
		// 一定要验签，防止黑客篡改参数
		Map<String, String[]> parameterMap = request.getParameterMap();
		StringBuilder notifyBuild = new StringBuilder(
				"/****************************** alipay notify ******************************/\n");
		parameterMap.forEach((key, value) -> notifyBuild.append(key + "=" + value[0] + "\n"));
//        log.info(notifyBuild.toString());

		boolean flag = this.rsaCheckV1(request);
		if (flag) {
			/**
			 * TODO 需要严格按照如下描述校验通知数据的正确性
			 *
			 * 商户需要验证该通知数据中的out_trade_no是否为商户系统中创建的订单号，
			 * 并判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），
			 * 同时需要校验通知中的seller_id（或者seller_email)
			 * 是否为out_trade_no这笔单据的对应的操作方（有的时候，一个商户可能有多个seller_id/seller_email），
			 *
			 * 上述有任何一个验证不通过，则表明本次通知是异常通知，务必忽略。
			 * 在上述验证通过后商户必须根据支付宝不同类型的业务通知，正确的进行不同的业务处理，并且过滤重复的通知结果数据。
			 * 在支付宝的业务通知中，只有交易通知状态为TRADE_SUCCESS或TRADE_FINISHED时，支付宝才会认定为买家付款成功。
			 */

			// 交易状态
			String tradeStatus = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "UTF-8");
			// 商户订单号
			String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");
			// 支付宝交易号
			String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");
			// 付款金额
			String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");
			// TRADE_FINISHED(表示交易已经成功结束，并不能再对该交易做后续操作);
			// TRADE_SUCCESS(表示交易已经成功结束，可以对该交易做后续操作，如：分润、退款等);
			if (tradeStatus.equals("TRADE_FINISHED")) {
				// 判断该笔订单是否在商户网站中已经做过处理
				// 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细， 
				// 并判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），并执行商户的业务程序
				// 请务必判断请求时的total_fee、seller_id与通知时获取的total_fee、seller_id为一致的
				// 如果有做过处理，不执行商户的业务程序

				// 注意：
				// 如果签约的是可退款协议，退款日期超过可退款期限后（如三个月可退款），支付宝系统发送该交易状态通知
				// 如果没有签约可退款协议，那么付款完成后，支付宝系统发送该交易状态通知。
			} else if (tradeStatus.equals("TRADE_SUCCESS")) {
				// 判断该笔订单是否在商户网站中已经做过处理
				// 如果没有做过处理，根据订单号（out_trade_no）在商户网站的订单系统中查到该笔订单的详细，
				// 并判断total_amount是否确实为该订单的实际金额（即商户订单创建时的金额），并执行商户的业务程序
				// 请务必判断请求时的total_fee、seller_id与通知时获取的total_fee、seller_id为一致的
				// 如果有做过处理，不执行商户的业务程序

				// 注意：
				// 如果签约的是可退款协议，那么付款完成后，支付宝系统发送该交易状态通知。

			}

			return "success";
		}

		return "fail";
	}

	/**
	 * 订单查询(最主要用于查询订单的支付状态)
	 * 
	 * @param orderNo 商户订单号
	 * @return
	 * @throws AlipayApiException
	 */
	@GetMapping("/query")
	public String query(String orderNo) throws AlipayApiException {

		AlipayClient alipayClient = AlipayUtil.getClient();
		AlipayTradeFastpayRefundQueryRequest request = new AlipayTradeFastpayRefundQueryRequest();
		request.setBizContent("{" + "    \"trade_no\":\"20150320010101001\","
				+ "    \"out_trade_no\":\"2014112611001004680073956707\","
				+ "    \"out_request_no\":\"2014112611001004680073956707\"" + "  }");
		AlipayTradeFastpayRefundQueryResponse response = alipayClient.execute(request);
		if (response.isSuccess()) {
			System.out.println("调用成功");
		} else {
			System.out.println("调用失败");
		}

		return response.getBody();
	}

	/**
	 * 退款
	 * 
	 * @param orderNo 商户订单号
	 * @return
	 */
	@PostMapping("/refund")
	@ResponseBody
	public String refund(String orderNo) throws AlipayApiException {
		AlipayTradeRefundRequest alipayRequest = new AlipayTradeRefundRequest();

		AlipayTradeRefundModel model = new AlipayTradeRefundModel();
		// 商户订单号
		model.setOutTradeNo(orderNo);
		// 退款金额
		model.setRefundAmount("0.01");
		// 退款原因
		model.setRefundReason("无理由退货");
		// 退款订单号(同一个订单可以分多次部分退款，当分多次时必传)
//        model.setOutRequestNo(UUID.randomUUID().toString());
		alipayRequest.setBizModel(model);

		AlipayTradeRefundResponse alipayResponse = AlipayUtil.getClient().execute(alipayRequest);
		System.out.println(alipayResponse.getBody());

		return alipayResponse.getBody();
	}

	/**
	 * 退款查询
	 * 
	 * @param orderNo       商户订单号
	 * @param refundOrderNo 请求退款接口时，传入的退款请求号，如果在退款请求时未传入，则该值为创建交易时的外部订单号
	 * @return
	 * @throws AlipayApiException
	 */
	@GetMapping("/refundQuery")
	@ResponseBody
	public String refundQuery(String orderNo, String refundOrderNo) throws AlipayApiException {
		AlipayTradeFastpayRefundQueryRequest alipayRequest = new AlipayTradeFastpayRefundQueryRequest();

		AlipayTradeFastpayRefundQueryModel model = new AlipayTradeFastpayRefundQueryModel();
		model.setOutTradeNo(orderNo);
		model.setOutRequestNo(refundOrderNo);
		alipayRequest.setBizModel(model);

		AlipayTradeFastpayRefundQueryResponse alipayResponse = AlipayUtil.getClient().execute(alipayRequest);
		System.out.println(alipayResponse.getBody());

		return alipayResponse.getBody();
	}

	/**
	 * 关闭交易
	 * 
	 * @param orderNo
	 * @return
	 * @throws AlipayApiException
	 */
	@PostMapping("/close")
	@ResponseBody
	public String close(String orderNo) throws AlipayApiException {
		AlipayTradeCloseRequest alipayRequest = new AlipayTradeCloseRequest();
		AlipayTradeCloseModel model = new AlipayTradeCloseModel();
		model.setOutTradeNo(orderNo);
		alipayRequest.setBizModel(model);

		AlipayTradeCloseResponse alipayResponse = AlipayUtil.getClient().execute(alipayRequest);
		System.out.println(alipayResponse.getBody());

		return alipayResponse.getBody();
	}

	/**
	 * billDate : 账单时间：日账单格式为yyyy-MM-dd，月账单格式为yyyy-MM。 查询对账单下载地址:
	 * https://docs.open.alipay.com/api_15/alipay.data.dataservice.bill.downloadurl.query/
	 * 
	 * @param billDate
	 */
	@GetMapping("/bill")
	@ResponseBody
	public void queryBill(String billDate) {
		// 1. 查询对账单下载地址
		AlipayDataDataserviceBillDownloadurlQueryRequest request = new AlipayDataDataserviceBillDownloadurlQueryRequest();
		AlipayDataDataserviceBillDownloadurlQueryModel model = new AlipayDataDataserviceBillDownloadurlQueryModel();
		model.setBillType("trade");
		model.setBillDate(billDate);
		request.setBizModel(model);
		try {
			AlipayDataDataserviceBillDownloadurlQueryResponse response = AlipayUtil.getClient().execute(request);
			if (response.isSuccess()) {
				String billDownloadUrl = response.getBillDownloadUrl();
				System.out.println(billDownloadUrl);

				// 2. 下载对账单
				List<String> orderList = this.downloadBill(billDownloadUrl);
				System.out.println(orderList);
				// 3. 先比较支付宝的交易合计/退款合计笔数/实收金额是否和自己数据库中的数据一致，如果不一致证明有异常，再具体找出那些订单有异常
				// 查找支付宝支付成功而自己支付失败的记录和支付宝支付失败而自己认为支付成功的异常订单记录到数据库

			} else {
				// 失败
				String code = response.getCode();
				String msg = response.getMsg();
				String subCode = response.getSubCode();
				String subMsg = response.getSubMsg();
			}
		} catch (AlipayApiException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 校验签名
	 * 
	 * @param request
	 * @return
	 */
	public boolean rsaCheckV1(HttpServletRequest request) {
		// https://docs.open.alipay.com/54/106370
		// 获取支付宝POST过来反馈信息
		Map<String, String> params = new HashMap<>();
		Map requestParams = request.getParameterMap();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
			}
			params.put(name, valueStr);
		}

		try {
			boolean verifyResult = AlipaySignature.rsaCheckV1(params, AlipayUtil.ALIPAY_PUBLIC_KEY, AlipayUtil.CHARSET,
					AlipayUtil.SIGN_TYPE);

			return verifyResult;
		} catch (AlipayApiException e) {
			System.out.println("verify sigin error, exception is:{}" + e);
			return false;
		}
	}

	/**
	 * 下载下来的是一个【账号_日期.csv.zip】文件（zip压缩文件名，里面有多个.csv文件） 账号_日期_业务明细 ： 支付宝业务明细查询
	 * 账号_日期_业务明细(汇总)：支付宝业务汇总查询
	 *
	 * 注意：如果数据量比较大，该方法可能需要更长的执行时间
	 * 
	 * @param billDownLoadUrl
	 * @return
	 * @throws IOException
	 */
	private List<String> downloadBill(String billDownLoadUrl) throws IOException {
		String ordersStr = "";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		RequestConfig config = RequestConfig.custom().setConnectTimeout(60000).setConnectionRequestTimeout(60000)
				.setSocketTimeout(60000).build();
		HttpGet httpRequest = new HttpGet(billDownLoadUrl);
		httpRequest.setConfig(config);
		CloseableHttpResponse response = null;
		byte[] data = null;
		try {
			response = httpClient.execute(httpRequest);
			HttpEntity entity = response.getEntity();
			data = EntityUtils.toByteArray(entity);
		} finally {
			response.close();
			httpClient.close();
		}
		ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(data), Charset.forName("GBK"));
		ZipEntry zipEntry = null;
		try {
			while ((zipEntry = zipInputStream.getNextEntry()) != null) {
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				try {
					String name = zipEntry.getName();
					// 只要明细不要汇总
					if (name.contains("汇总")) {
						continue;
					}
					byte[] byteBuff = new byte[4096];
					int bytesRead = 0;
					while ((bytesRead = zipInputStream.read(byteBuff)) != -1) {
						byteArrayOutputStream.write(byteBuff, 0, bytesRead);
					}
					ordersStr = byteArrayOutputStream.toString("GBK");
				} finally {
					byteArrayOutputStream.close();
					zipInputStream.closeEntry();
				}
			}
		} finally {
			zipInputStream.close();
		}

		if (ordersStr.equals("")) {
			return null;
		}
		String[] bills = ordersStr.split("\r\n");
		List<String> billList = Arrays.asList(bills);
		billList = billList.parallelStream().map(item -> item.replace("\t", "")).collect(Collectors.toList());

		return billList;
	}
}
