package com.rondaful.cloud.seller.entity;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * ebay捆绑商品表
 * 实体类对应的数据表为：  ebay_publish_listing_variant_skus
 * @author chenhan
 * @date 2019-08-30 10:35:39
 */
@ApiModel(value ="EbayPublishListingVariantSkus")
public class EbayPublishListingVariantSkus implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "刊登id")
    private Long listingId;

    @ApiModelProperty(value = "变体商品id")
    private Long variantId;

    @ApiModelProperty(value = "商品sku")
    private String plSku;

    @ApiModelProperty(value = "商品sku数量")
    private Integer plSkuNumber;

    @ApiModelProperty(value = "商品名称")
    private String plSkuName;

    @ApiModelProperty(value = "商品属性")
    private String plSkuAttribute;

    @ApiModelProperty(value = "库存数量(显示字段)")
    private Long availableQty;

    @ApiModelProperty(value = "显示状态 0正常1下架2侵权3缺货4低于预警(显示字段)")
    private Integer showStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ebay_publish_listing_variant_skus
     *
     * @mbg.generated 2019-08-30 10:35:39
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getListingId() {
        return listingId;
    }

    public void setListingId(Long listingId) {
        this.listingId = listingId;
    }

    public Long getVariantId() {
        return variantId;
    }

    public void setVariantId(Long variantId) {
        this.variantId = variantId;
    }

    public String getPlSku() {
        return plSku;
    }

    public void setPlSku(String plSku) {
        this.plSku = plSku == null ? null : plSku.trim();
    }

    public Integer getPlSkuNumber() {
        return plSkuNumber;
    }

    public void setPlSkuNumber(Integer plSkuNumber) {
        this.plSkuNumber = plSkuNumber;
    }

    public String getPlSkuName() {
        return plSkuName;
    }

    public void setPlSkuName(String plSkuName) {
        this.plSkuName = plSkuName == null ? null : plSkuName.trim();
    }

    public String getPlSkuAttribute() {
        return plSkuAttribute;
    }

    public void setPlSkuAttribute(String plSkuAttribute) {
        this.plSkuAttribute = plSkuAttribute == null ? null : plSkuAttribute.trim();
    }

    public Long getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(Long availableQty) {
        this.availableQty = availableQty;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }
}