package com.rondaful.cloud.supplier.entity.inventory;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Inventory implements Serializable {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "仓库id")
    private Integer warehouseId;

    @ApiModelProperty(value = "供应商sku")
    private String supplierSku;

    @ApiModelProperty(value = "在途数量")
    private Integer instransitQty;

    @ApiModelProperty(value = "可用数量")
    private Integer availableQty;

    @ApiModelProperty(value = "数量")
    private Integer qty;

    @ApiModelProperty(value = "待出库")
    private Integer waitingShippingQty;

    @ApiModelProperty(value = "待入库")
    private Integer allocatingQty;

    @ApiModelProperty(value = "故障品数量")
    private Integer defectsQty;

    @ApiModelProperty(value = "品连sku")
    private String pinlianSku;

    @ApiModelProperty(value = "商品编码(客户代码-商品编码)")
    private String productBarcode;

    @ApiModelProperty(value = "待上架数量")
    private Integer pendingQty;

    @ApiModelProperty(value = "历史出库数量")
    private Integer shippedQty;

    @ApiModelProperty(value = "已销售的共享数量")
    private Integer soldSharedQty;

    @ApiModelProperty(value = "备货数量")
    private Integer stockingQty;

    @ApiModelProperty(value = "缺货数量")
    private Integer piNoStockQty;

    @ApiModelProperty(value = "待调出")
    private Integer tuneOutQty;

    @ApiModelProperty(value = "待调入")
    private Integer tuneInQty;

    @ApiModelProperty(value = "商品销售价值")
    private BigDecimal productSalesValue;

    @ApiModelProperty(value = "预警值")
    private Integer warnVal;

    @ApiModelProperty(value = "")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date syncTime;

    @ApiModelProperty(value = "最后更新人")
    private String updateBy;

    @ApiModelProperty(value = "最后更新时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateDate;

    @ApiModelProperty(value = "供应商id")
    private Integer supplierId;

    @ApiModelProperty(value = "本地待出库")
    private Integer localWaitingShippingQty;

    @ApiModelProperty(value = "关联的卖家id数组")
    private String sellerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_inventory_0
     *
     * @mbg.generated 2019-06-15 11:36:07
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getSupplierSku() {
        return supplierSku;
    }

    public void setSupplierSku(String supplierSku) {
        this.supplierSku = supplierSku == null ? null : supplierSku.trim();
    }

    public Integer getInstransitQty() {
        return instransitQty;
    }

    public void setInstransitQty(Integer instransitQty) {
        this.instransitQty = instransitQty;
    }

    public Integer getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(Integer availableQty) {
        this.availableQty = availableQty;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getWaitingShippingQty() {
        return waitingShippingQty;
    }

    public void setWaitingShippingQty(Integer waitingShippingQty) {
        this.waitingShippingQty = waitingShippingQty;
    }

    public Integer getAllocatingQty() {
        return allocatingQty;
    }

    public void setAllocatingQty(Integer allocatingQty) {
        this.allocatingQty = allocatingQty;
    }

    public Integer getDefectsQty() {
        return defectsQty;
    }

    public void setDefectsQty(Integer defectsQty) {
        this.defectsQty = defectsQty;
    }


    public String getPinlianSku() {
        return pinlianSku;
    }

    public void setPinlianSku(String pinlianSku) {
        this.pinlianSku = pinlianSku == null ? null : pinlianSku.trim();
    }

    public String getProductBarcode() {
        return productBarcode;
    }

    public void setProductBarcode(String productBarcode) {
        this.productBarcode = productBarcode == null ? null : productBarcode.trim();
    }

    public Integer getPendingQty() {
        return pendingQty;
    }

    public void setPendingQty(Integer pendingQty) {
        this.pendingQty = pendingQty;
    }

    public Integer getShippedQty() {
        return shippedQty;
    }

    public void setShippedQty(Integer shippedQty) {
        this.shippedQty = shippedQty;
    }

    public Integer getSoldSharedQty() {
        return soldSharedQty;
    }

    public void setSoldSharedQty(Integer soldSharedQty) {
        this.soldSharedQty = soldSharedQty;
    }

    public Integer getStockingQty() {
        return stockingQty;
    }

    public void setStockingQty(Integer stockingQty) {
        this.stockingQty = stockingQty;
    }

    public Integer getPiNoStockQty() {
        return piNoStockQty;
    }

    public void setPiNoStockQty(Integer piNoStockQty) {
        this.piNoStockQty = piNoStockQty;
    }

    public Integer getTuneOutQty() {
        return tuneOutQty;
    }

    public void setTuneOutQty(Integer tuneOutQty) {
        this.tuneOutQty = tuneOutQty;
    }

    public Integer getTuneInQty() {
        return tuneInQty;
    }

    public void setTuneInQty(Integer tuneInQty) {
        this.tuneInQty = tuneInQty;
    }

    public BigDecimal getProductSalesValue() {
        return productSalesValue;
    }

    public void setProductSalesValue(BigDecimal productSalesValue) {
        this.productSalesValue = productSalesValue;
    }

    public Integer getWarnVal() {
        return warnVal;
    }

    public void setWarnVal(Integer warnVal) {
        this.warnVal = warnVal;
    }

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getLocalWaitingShippingQty() {
        return localWaitingShippingQty;
    }

    public void setLocalWaitingShippingQty(Integer localWaitingShippingQty) {
        this.localWaitingShippingQty = localWaitingShippingQty;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }
}