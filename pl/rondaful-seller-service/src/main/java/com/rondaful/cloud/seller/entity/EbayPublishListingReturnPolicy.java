package com.rondaful.cloud.seller.entity;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 物品刊登退换货政策表
 * 实体类对应的数据表为：  ebay_publish_listing_return_policy
 * @author chenhan
 * @date 2019-06-18 17:42:08
 */
@ApiModel(value ="EbayPublishListingReturnPolicy")
public class EbayPublishListingReturnPolicy implements Serializable {
    @ApiModelProperty(value = "注键id")
    private Long id;

    @ApiModelProperty(value = "")
    private Long listingId;

    @ApiModelProperty(value = "退货期限")
    private String returnsWithinOption;//日期

    @ApiModelProperty(value = "退货方式")
    private String refundOption;

    @ApiModelProperty(value = "退货邮费承当是买家，还是卖家")
    private String shippingCostPaidByOption;

    @ApiModelProperty(value = "退货说明")
    private String description;

    @ApiModelProperty(value = "是否接受国际退货")
    private String internationalReturnsWithinOption;

    @ApiModelProperty(value = "国际退货方式")
    private String internationalRefundOption;

    @ApiModelProperty(value = "国际退货邮费承当是买家，还是卖家")
    private String internationalShippingCostPaidByOption;

    @ApiModelProperty(value = "国际退货期限")
    private String internationalReturnsAcceptedOption;

    @ApiModelProperty(value = "是否接受退货")
    private String returnsAcceptedOption;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ebay_publish_listing_return_policy
     *
     * @mbg.generated 2019-06-18 17:42:08
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

    public String getReturnsWithinOption() {
        return returnsWithinOption;
    }

    public void setReturnsWithinOption(String returnsWithinOption) {
        this.returnsWithinOption = returnsWithinOption == null ? null : returnsWithinOption.trim();
    }

    public String getRefundOption() {
        return refundOption;
    }

    public void setRefundOption(String refundOption) {
        this.refundOption = refundOption == null ? null : refundOption.trim();
    }

    public String getShippingCostPaidByOption() {
        return shippingCostPaidByOption;
    }

    public void setShippingCostPaidByOption(String shippingCostPaidByOption) {
        this.shippingCostPaidByOption = shippingCostPaidByOption == null ? null : shippingCostPaidByOption.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getInternationalReturnsWithinOption() {
        return internationalReturnsWithinOption;
    }

    public void setInternationalReturnsWithinOption(String internationalReturnsWithinOption) {
        this.internationalReturnsWithinOption = internationalReturnsWithinOption == null ? null : internationalReturnsWithinOption.trim();
    }

    public String getInternationalRefundOption() {
        return internationalRefundOption;
    }

    public void setInternationalRefundOption(String internationalRefundOption) {
        this.internationalRefundOption = internationalRefundOption == null ? null : internationalRefundOption.trim();
    }

    public String getInternationalShippingCostPaidByOption() {
        return internationalShippingCostPaidByOption;
    }

    public void setInternationalShippingCostPaidByOption(String internationalShippingCostPaidByOption) {
        this.internationalShippingCostPaidByOption = internationalShippingCostPaidByOption == null ? null : internationalShippingCostPaidByOption.trim();
    }

    public String getInternationalReturnsAcceptedOption() {
        return internationalReturnsAcceptedOption;
    }

    public void setInternationalReturnsAcceptedOption(String internationalReturnsAcceptedOption) {
        this.internationalReturnsAcceptedOption = internationalReturnsAcceptedOption == null ? null : internationalReturnsAcceptedOption.trim();
    }

    public String getReturnsAcceptedOption() {
        return returnsAcceptedOption;
    }

    public void setReturnsAcceptedOption(String returnsAcceptedOption) {
        this.returnsAcceptedOption = returnsAcceptedOption == null ? null : returnsAcceptedOption.trim();
    }
}