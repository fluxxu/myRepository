package com.rondaful.cloud.transorder.entity.system;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 系统订单项详情表
 * 实体类对应的数据表为：  tb_sys_order_detail
 * @author guoxuankai
 * @date 2019-09-21 10:55:08
 */
@ApiModel(value ="SysOrderDetail")
public class SysOrderDetail implements Serializable {

    @ApiModelProperty(value = "顺序号")
    private Integer id;

    @ApiModelProperty(value = "品连订单ID")
    private String sysOrderId;

    @ApiModelProperty(value = "来源订单ID")
    private String sourceOrderId;

    @ApiModelProperty(value = "来源订单项ID")
    private String sourceOrderLineItemId;

    @ApiModelProperty(value = "系统订单项ID")
    private String orderLineItemId;

    @ApiModelProperty(value = "单个商品体积,单位m³")
    private BigDecimal bulk;

    @ApiModelProperty(value = "单个商品重量,单位g")
    private BigDecimal weight;

    @ApiModelProperty(value = "商品ID")
    private Long itemId;

    @ApiModelProperty(value = "商品最迟发货时间")
    private String deliverDeadline;

    @ApiModelProperty(value = "品连单个商品成本价")
    private BigDecimal itemCost;

    @ApiModelProperty(value = "商品URL")
    private String itemUrl;

    @ApiModelProperty(value = "商品名称")
    private String itemName;

    @ApiModelProperty(value = "商品英文名")
    private String itemNameEn;

    @ApiModelProperty(value = "商品属性")
    private String itemAttr;

    @ApiModelProperty(value = "商品系统单价")
    private BigDecimal itemPrice;

    @ApiModelProperty(value = "订单项SKU")
    private String sku;

    @ApiModelProperty(value = "SKU标题")
    private String skuTitle;

    @ApiModelProperty(value = "购买此SKU总数量")
    private Integer skuQuantity;

    @ApiModelProperty(value = "系统SKU运费")
    private BigDecimal skuShippingFee;

    @ApiModelProperty(value = "服务费扣取类型&数额[抽取类型(1为固定金额,2为百分比)#数额(例1#2.00,2#0.05)]")
    private String fareTypeAmount;

    @ApiModelProperty(value = "所属供应商id")
    private Long supplierId;

    @ApiModelProperty(value = "所属供应商名称")
    private String supplierName;

    @ApiModelProperty(value = "供应商所属供应链ID")
    private Integer supplyChainCompanyId;

    @ApiModelProperty(value = "供应商所属供应链名称")
    private String supplyChainCompanyName;

    @ApiModelProperty(value = "供应商SKU")
    private String supplierSku;

    @ApiModelProperty(value = "供应商SKU标题")
    private String supplierSkuTitle;

    @ApiModelProperty(value = "供应商SKU单价")
    private BigDecimal supplierSkuPrice;

    @ApiModelProperty(value = "销售记录号")
    private Integer recordNumber;

    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "更新时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "原始sku")
    private String sourceSku;

    @ApiModelProperty(value = "是否包邮。1-包邮，0-不包邮")
    private Boolean freeFreight;

    @ApiModelProperty(value = "是否进行过售后:0否,1是")
    private Byte isAfterSale;

    @ApiModelProperty(value = "平台SKU的绑定状态：已绑定:bind,未绑定:unbind,已移除:remove")
    private String bindStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_sys_order_detail
     *
     * @mbg.generated 2019-09-21 10:55:08
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSysOrderId() {
        return sysOrderId;
    }

    public void setSysOrderId(String sysOrderId) {
        this.sysOrderId = sysOrderId == null ? null : sysOrderId.trim();
    }

    public String getSourceOrderId() {
        return sourceOrderId;
    }

    public void setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId == null ? null : sourceOrderId.trim();
    }

    public String getSourceOrderLineItemId() {
        return sourceOrderLineItemId;
    }

    public void setSourceOrderLineItemId(String sourceOrderLineItemId) {
        this.sourceOrderLineItemId = sourceOrderLineItemId == null ? null : sourceOrderLineItemId.trim();
    }

    public String getOrderLineItemId() {
        return orderLineItemId;
    }

    public void setOrderLineItemId(String orderLineItemId) {
        this.orderLineItemId = orderLineItemId == null ? null : orderLineItemId.trim();
    }

    public BigDecimal getBulk() {
        return bulk;
    }

    public void setBulk(BigDecimal bulk) {
        this.bulk = bulk;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getDeliverDeadline() {
        return deliverDeadline;
    }

    public void setDeliverDeadline(String deliverDeadline) {
        this.deliverDeadline = deliverDeadline == null ? null : deliverDeadline.trim();
    }

    public BigDecimal getItemCost() {
        return itemCost;
    }

    public void setItemCost(BigDecimal itemCost) {
        this.itemCost = itemCost;
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl == null ? null : itemUrl.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemNameEn() {
        return itemNameEn;
    }

    public void setItemNameEn(String itemNameEn) {
        this.itemNameEn = itemNameEn == null ? null : itemNameEn.trim();
    }

    public String getItemAttr() {
        return itemAttr;
    }

    public void setItemAttr(String itemAttr) {
        this.itemAttr = itemAttr == null ? null : itemAttr.trim();
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku == null ? null : sku.trim();
    }

    public String getSkuTitle() {
        return skuTitle;
    }

    public void setSkuTitle(String skuTitle) {
        this.skuTitle = skuTitle == null ? null : skuTitle.trim();
    }

    public Integer getSkuQuantity() {
        return skuQuantity;
    }

    public void setSkuQuantity(Integer skuQuantity) {
        this.skuQuantity = skuQuantity;
    }

    public BigDecimal getSkuShippingFee() {
        return skuShippingFee;
    }

    public void setSkuShippingFee(BigDecimal skuShippingFee) {
        this.skuShippingFee = skuShippingFee;
    }

    public String getFareTypeAmount() {
        return fareTypeAmount;
    }

    public void setFareTypeAmount(String fareTypeAmount) {
        this.fareTypeAmount = fareTypeAmount == null ? null : fareTypeAmount.trim();
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Integer getSupplyChainCompanyId() {
        return supplyChainCompanyId;
    }

    public void setSupplyChainCompanyId(Integer supplyChainCompanyId) {
        this.supplyChainCompanyId = supplyChainCompanyId;
    }

    public String getSupplyChainCompanyName() {
        return supplyChainCompanyName;
    }

    public void setSupplyChainCompanyName(String supplyChainCompanyName) {
        this.supplyChainCompanyName = supplyChainCompanyName == null ? null : supplyChainCompanyName.trim();
    }

    public String getSupplierSku() {
        return supplierSku;
    }

    public void setSupplierSku(String supplierSku) {
        this.supplierSku = supplierSku == null ? null : supplierSku.trim();
    }

    public String getSupplierSkuTitle() {
        return supplierSkuTitle;
    }

    public void setSupplierSkuTitle(String supplierSkuTitle) {
        this.supplierSkuTitle = supplierSkuTitle == null ? null : supplierSkuTitle.trim();
    }

    public BigDecimal getSupplierSkuPrice() {
        return supplierSkuPrice;
    }

    public void setSupplierSkuPrice(BigDecimal supplierSkuPrice) {
        this.supplierSkuPrice = supplierSkuPrice;
    }

    public Integer getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(Integer recordNumber) {
        this.recordNumber = recordNumber;
    }

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSourceSku() {
        return sourceSku;
    }

    public void setSourceSku(String sourceSku) {
        this.sourceSku = sourceSku == null ? null : sourceSku.trim();
    }

    public Boolean getFreeFreight() {
        return freeFreight;
    }

    public void setFreeFreight(Boolean freeFreight) {
        this.freeFreight = freeFreight;
    }

    public Byte getIsAfterSale() {
        return isAfterSale;
    }

    public void setIsAfterSale(Byte isAfterSale) {
        this.isAfterSale = isAfterSale;
    }

    public String getBindStatus() {
        return bindStatus;
    }

    public void setBindStatus(String bindStatus) {
        this.bindStatus = bindStatus == null ? null : bindStatus.trim();
    }
}