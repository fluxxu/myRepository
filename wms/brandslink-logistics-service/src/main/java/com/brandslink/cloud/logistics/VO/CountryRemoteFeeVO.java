package com.brandslink.cloud.logistics.VO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 偏远地区运费表
 * 实体类对应的数据表为：  t_country_remote_fee
 * @author zhangjinglei
 * @date 2019-07-23 10:59:56
 */
@Data
@ApiModel(value = "CountryRemoteFeeVO")
public class CountryRemoteFeeVO implements Serializable {
    @ApiModelProperty(value = "顺序号")
    private Long id;

    @ApiModelProperty(value = "关联物流方式分区国家表主键")
    private Long countryId;

    @NotBlank(message = "国家编码不能为空")
    @ApiModelProperty(value = "国家编码")
    private String country;

    @NotBlank(message = "城市不能为空")
    @ApiModelProperty(value = "城市")
    private String city;

    @Max(value = 200000, message = "首重（g）最大值为200000")
    @Min(value = 0, message = "首重（g）最小值为0")
    @NotNull(message = "首重（g）不能为空，默认为0")
    @ApiModelProperty(value = "首重（g）")
    private Integer firstWeight;

    @DecimalMax(value = "20000.000", message = "首重收费（元）最高为20000元")
    @DecimalMin(value = "0.000", message = "首重收费（元）最低0元")
    @NotNull(message = "首重收费（元）不可为空")
    @Digits(integer = 18, fraction = 3, message = "首重收费（元）限制为18位整数3位小数")
    @ApiModelProperty(value = "首重收费（元）")
    private BigDecimal firstWeightFee;

    @Max(value = 200000, message = "续重（g）最大值为200000")
    @Min(value = 0, message = "续重（g）最小值为0")
    @NotNull(message = "续重（g）不能为空，默认为0")
    @ApiModelProperty(value = "续重（g）")
    private Integer renewWeight;

    @DecimalMax(value = "20000.000", message = "续重收费（元）最高为20000元")
    @DecimalMin(value = "0.000", message = "续重收费（元）最低0元")
    @NotNull(message = "续重收费（元）不可为空")
    @Digits(integer = 18, fraction = 3, message = "续重收费（元）限制为18位整数3位小数")
    @ApiModelProperty(value = "续重收费（元）")
    private BigDecimal renewWeightFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_country_remote_fee
     *
     * @mbg.generated 2019-07-23 10:59:56
     */
    private static final long serialVersionUID = 1L;
}