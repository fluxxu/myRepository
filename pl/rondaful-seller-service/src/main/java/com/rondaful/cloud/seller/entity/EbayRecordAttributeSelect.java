package com.rondaful.cloud.seller.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * ebay商品属性记录表
 * 实体类对应的数据表为：  ebay_record_attribute_select
 * @author chenhan
 * @date 2019-08-12 14:37:21
 */
@ApiModel(value ="EbayRecordAttributeSelect")
public class EbayRecordAttributeSelect implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "分类id")
    private Long categoryId;

    @ApiModelProperty(value = "站点")
    private String site;

    @ApiModelProperty(value = "商品spu")
    private String plSpu;

    @ApiModelProperty(value = "商品属性值")
    private String attributeVal;

    @ApiModelProperty(value = "商品属性选择值")
    private String attributeSelectVal;

    @ApiModelProperty(value = "刊登账号id")
    private Long numberAdd;

    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @ApiModelProperty(value = "0  有效  1 无效")
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ebay_record_attribute_select
     *
     * @mbg.generated 2019-08-12 14:37:21
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getPlSpu() {
        return plSpu;
    }

    public void setPlSpu(String plSpu) {
        this.plSpu = plSpu == null ? null : plSpu.trim();
    }

    public String getAttributeVal() {
        return attributeVal;
    }

    public void setAttributeVal(String attributeVal) {
        this.attributeVal = attributeVal == null ? null : attributeVal.trim();
    }

    public String getAttributeSelectVal() {
        return attributeSelectVal;
    }

    public void setAttributeSelectVal(String attributeSelectVal) {
        this.attributeSelectVal = attributeSelectVal == null ? null : attributeSelectVal.trim();
    }

    public Long getNumberAdd() {
        return numberAdd;
    }

    public void setNumberAdd(Long numberAdd) {
        this.numberAdd = numberAdd;
    }

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}