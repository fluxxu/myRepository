package com.rondaful.cloud.supplier.entity.Logistics;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class Logistics implements Serializable {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "仓库id")
    private Integer warehouseId;

    @ApiModelProperty(value = "运输方式代码")
    private String code;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "运输方式中文名称")
    private String name;

    @ApiModelProperty(value = "运输方式英文名称")
    private String nameEn;

    @ApiModelProperty(value = "服务商代码")
    private String spCode;

    @ApiModelProperty(value = "服务商名称")
    private String spName;

    @ApiModelProperty(value = "服务商英文名称")
    private String spNameEn;

    @ApiModelProperty(value = "版本号")
    private Integer version;


    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_logistics
     *
     * @mbg.generated 2019-10-16 17:23:43
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getSpCode() {
        return spCode;
    }

    public void setSpCode(String spCode) {
        this.spCode = spCode == null ? null : spCode.trim();
    }

    public String getSpName() {
        return spName;
    }

    public void setSpName(String spName) {
        this.spName = spName == null ? null : spName.trim();
    }

    public String getSpNameEn() {
        return spNameEn;
    }

    public void setSpNameEn(String spNameEn) {
        this.spNameEn = spNameEn == null ? null : spNameEn.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}