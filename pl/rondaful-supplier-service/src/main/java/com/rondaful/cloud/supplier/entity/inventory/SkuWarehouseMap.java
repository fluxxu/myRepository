package com.rondaful.cloud.supplier.entity.inventory;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class SkuWarehouseMap implements Serializable {

    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "品连sku")
    private String pinlianSku;

    @ApiModelProperty(value = "仓库id")
    private Integer warehouseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sku_warehouse_map_0
     *
     * @mbg.generated 2019-06-14 14:32:25
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

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }
}