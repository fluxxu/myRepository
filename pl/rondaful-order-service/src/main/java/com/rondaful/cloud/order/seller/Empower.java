package com.rondaful.cloud.order.seller;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
/**
 * 店铺授权
 * 实体类对应的数据表为：  empower
 * @author zjl
 * @date 2019-05-05 14:47:55
 */
@Data
@ApiModel(value ="Empower")
public class Empower implements Serializable {
    @ApiModelProperty(value = "同步订单开始时间")
    private Calendar modTimeFrom;

    @ApiModelProperty(value = "同步订单结束时间")
    private Calendar modTimeTo;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "id")
    private Integer empowerid;

    @ApiModelProperty(value = "ebay   亚马逊 速卖通 平台店铺账号")
    private String account;

    @ApiModelProperty(value = "状态  （0未授权  1 正常授权  2授权过期 3停用4迁移）")
    private Byte status;

    @ApiModelProperty(value = "平台 (1 ebay   2 Amazon 3 aliexpress)")
    private Byte platform;

    @ApiModelProperty(value = "授权令牌")
    private String token;

    @ApiModelProperty(value = "第三方的账号或id")
    private String thirdpartyname;

    @ApiModelProperty(value = "站点名称")
    private String webname;

    @ApiModelProperty(value = "paypal账号01")
    private String paypalaccount01;

    @ApiModelProperty(value = "paypal账号02")
    private String paypalaccount02;

    @ApiModelProperty(value = "授权时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date autotime;

    @ApiModelProperty(value = "授权到期时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date endtime;

    @ApiModelProperty(value = "修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    @ApiModelProperty(value = "品连账号")
    private String pinlianaccount;

    @ApiModelProperty(value = "品连id")
    private Integer pinlianid;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "父账号")
    private String parentaccount;

    @ApiModelProperty(value = "速卖通账号刷新token")
    private String refreshtoken;

    @ApiModelProperty(value = "店铺租赁状态( 0 个人店铺 1 租赁店铺 )")
    private Integer rentstatus;

    @ApiModelProperty(value = "eBay平台走什么平台的单0不启用 1:erp 2:品连 3我有自己的edis账号并且授权给品连")
    private Integer ebayEdis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table empower
     *
     * @mbg.generated 2019-05-05 14:47:55
     */
    private static final long serialVersionUID = 1L;
}