package com.rondaful.cloud.seller.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 速卖通分类属性选项值表
 * 实体类对应的数据表为：  aliexpress_category_attribute_select
 * @author chenhan
 * @date 2019-03-27 14:28:32
 */
@ApiModel(value ="AliexpressCategoryAttributeSelect")
public class AliexpressCategoryAttributeSelect implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "类别id")
    private Long categoryId;

    @ApiModelProperty(value = "属性id")
    private Long attributeId;

    @ApiModelProperty(value = "选项值id")
    private Long selectId;

    @ApiModelProperty(value = "名称")
    private String selectName;

    @ApiModelProperty(value = "英文名称")
    private String selectNameEn;

    @ApiModelProperty(value = "all名称,多语言名称")
    private String selectNameAll;

    @ApiModelProperty(value = "valueTags")
    private String valueTags;

    @ApiModelProperty(value = "刊登账号id")
    private Long empowerId;

    @ApiModelProperty(value = "创建者")
    private Long createId;

    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "0  有效  1 无效")
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aliexpress_category_attribute_select
     *
     * @mbg.generated 2019-03-27 14:28:32
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

    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    public Long getSelectId() {
        return selectId;
    }

    public void setSelectId(Long selectId) {
        this.selectId = selectId;
    }

    public String getSelectName() {
        return selectName;
    }

    public void setSelectName(String selectName) {
        this.selectName = selectName == null ? null : selectName.trim();
    }

    public String getSelectNameEn() {
        return selectNameEn;
    }

    public void setSelectNameEn(String selectNameEn) {
        this.selectNameEn = selectNameEn == null ? null : selectNameEn.trim();
    }

    public String getSelectNameAll() {
        return selectNameAll;
    }

    public void setSelectNameAll(String selectNameAll) {
        this.selectNameAll = selectNameAll == null ? null : selectNameAll.trim();
    }

    public String getValueTags() {
        return valueTags;
    }

    public void setValueTags(String valueTags) {
        this.valueTags = valueTags == null ? null : valueTags.trim();
    }

    public Long getEmpowerId() {
        return empowerId;
    }

    public void setEmpowerId(Long empowerId) {
        this.empowerId = empowerId;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}