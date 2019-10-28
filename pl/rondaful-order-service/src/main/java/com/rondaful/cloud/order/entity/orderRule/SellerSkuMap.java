package com.rondaful.cloud.order.entity.orderRule;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 卖家在平台上的sku和品连sku的映射
 */
@ApiModel(description = "卖家在平台上的sku和品连sku的映射对象")
public class SellerSkuMap implements Serializable {
    /**
     * sku映射的id 主键 自增
     */
    @ApiModelProperty(value = "sku映射的id 主键 自增")
    private Long id;

    @ApiModelProperty(value = "卖家所属平台名称[Amazon, eBay, wish, aliexpress]")
    private String platform;

    @ApiModelProperty(value = "授权id（品连平台的授权表格的id）")
    private String authorizationId;

    @ApiModelProperty(value = "授权id列表", hidden = true)
    private List<String> authorizationIds;

    /**
     * 在品连上的sku
     */
    @ApiModelProperty(value = "在品连上的sku")
    private String plSku;

    /**
     * 其他平台的sku
     */
    @ApiModelProperty(value = "其他平台的sku")
    private String platformSku;

    /**
     * 映射状态[1:启用  2:停用 ]
     */
    @ApiModelProperty(value = "映射状态[1:启用  2:停用 默认启用 ]")
    private Integer status;

    @ApiModelProperty(value = "version")
    private Long version;

/*    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")*/
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "开始创建时间，查询参数")
    private String startCreateTime;

    @ApiModelProperty(value = "结束创建时间，查询参数")
    private String endCreateTime;

    @ApiModelProperty(value = "卖家品连账号")
    private String sellerPlAccount;

    @ApiModelProperty(value = "卖家品连ID")
    private String sellerPlId;

    @ApiModelProperty(value = "卖家账号(授权时的自定义名称)")
    private String sellerSelfAccount;

    @ApiModelProperty(value = "卖家品连ID列表（部分查询可用）")
    private List<Integer> pinlianIds;

    /**
     * 后台传参数使用
     */
    @ApiModelProperty(value = "在品连上的sku列表",required = true)
    private List<String> plSkus;

    private static final long serialVersionUID = 1L;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getPlSku() {
        return plSku;
    }

    public void setPlSku(String plSku) {
        this.plSku = plSku == null ? null : plSku.trim();
    }

    public String getPlatformSku() {
        return platformSku;
    }

    public void setPlatformSku(String platformSku) {
        this.platformSku = platformSku == null ? null : platformSku.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(String startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public String getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(String endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }


    public String getAuthorizationId() {
        return authorizationId;
    }

    public void setAuthorizationId(String authorizationId) {
        this.authorizationId = authorizationId == null ? null : authorizationId.trim();
    }

    public String getSellerPlAccount() {
        return sellerPlAccount;
    }

    public void setSellerPlAccount(String sellerPlAccount) {
        this.sellerPlAccount = sellerPlAccount == null? null:sellerPlAccount.trim();
    }

    public String getSellerSelfAccount() {
        return sellerSelfAccount;
    }

    public void setSellerSelfAccount(String sellerSelfAccount) {
        this.sellerSelfAccount = sellerSelfAccount == null? null:sellerSelfAccount.trim();
    }

    public List<String> getAuthorizationIds() {
        return authorizationIds;
    }

    public void setAuthorizationIds(List<String> authorizationIds) {
        this.authorizationIds = authorizationIds;
    }

    public List<Integer> getPinlianIds() {
        return pinlianIds;
    }

    public void setPinlianIds(List<Integer> pinlianIds) {
        this.pinlianIds = pinlianIds;
    }

    public String getSellerPlId() {
        return sellerPlId;
    }

    public void setSellerPlId(String sellerPlId) {
        this.sellerPlId = sellerPlId;
    }

    public List<String> getPlSkus() {
        return plSkus;
    }

    public void setPlSkus(List<String> plSkus) {
        this.plSkus = plSkus;
    }
}