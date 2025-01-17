package com.rondaful.cloud.seller.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 实体类对应的数据表为：  t_warehouse_sync
 * @author lxx
 * @date 2018-12-04 15:53:16
 */
@ApiModel(value ="WarehouseSync")
public class WarehouseSync implements Serializable {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "仓库名称")
    private String warehouseName;

    @ApiModelProperty(value = "英文仓库名称")
    private String warehouseNameEn;

    @ApiModelProperty(value = "仓库编码")
    private String warehouseCode;

    @ApiModelProperty(value = "国家编码")
    private String countryCode;
    
    @ApiModelProperty(value = "仓库类型")
    private String warehouseType;

    @ApiModelProperty(value = "仓库服务商")
    private String warehouseProvider;
    
    @ApiModelProperty(value = "仓库是否可用")
    private boolean isAvailable;


	@ApiModelProperty(value = "")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createDate;
    
    @ApiModelProperty(value = "前端传递的状态筛选数据")
    private String choiceValid;


	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_warehouse_sync
     *
     * @mbg.generated 2018-12-04 15:53:16
     */
    private static final long serialVersionUID = 1L;
    
    public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode== null ? null : countryCode.trim();
	}

	public String getChoiceValid() {
		return choiceValid;
	}

	public void setChoiceValid(String choiceValid) {
		this.choiceValid = choiceValid== null ? null : choiceValid.trim();
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName == null ? null : warehouseName.trim();
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode == null ? null : warehouseCode.trim();
    }

    public String getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(String warehouseType) {
        this.warehouseType = warehouseType == null ? null : warehouseType.trim();
    }

    public String getWarehouseProvider() {
        return warehouseProvider;
    }

    public void setWarehouseProvider(String warehouseProvider) {
        this.warehouseProvider = warehouseProvider == null ? null : warehouseProvider.trim();
    }
    public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getWarehouseNameEn() {
        return warehouseNameEn;
    }

    public void setWarehouseNameEn(String warehouseNameEn) {
        this.warehouseNameEn = warehouseNameEn;
    }
}