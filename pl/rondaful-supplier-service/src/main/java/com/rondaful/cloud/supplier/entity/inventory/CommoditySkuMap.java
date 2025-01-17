package com.rondaful.cloud.supplier.entity.inventory;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class CommoditySkuMap implements Serializable {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "品连sku")
    private String pinlianSku;

    @ApiModelProperty(value = "平台sku")
    private String supplierSku;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_commodity_sku_map_0
     *
     * @mbg.generated 2019-06-17 09:14:19
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPinlianSku() {
        return pinlianSku;
    }

    public void setPinlianSku(String pinlianSku) {
        this.pinlianSku = pinlianSku == null ? null : pinlianSku.trim();
    }

    public String getSupplierSku() {
        return supplierSku;
    }

    public void setSupplierSku(String supplierSku) {
        this.supplierSku = supplierSku == null ? null : supplierSku.trim();
    }
}