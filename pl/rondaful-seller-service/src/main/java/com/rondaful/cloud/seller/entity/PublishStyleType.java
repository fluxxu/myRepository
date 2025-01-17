package com.rondaful.cloud.seller.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 刊登风格类型
 * 实体类对应的数据表为：  publish_style_type
 * @author chenhan
 * @date 2019-04-19 17:58:40
 */
@ApiModel(value ="PublishStyleType")
public class PublishStyleType implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "平台 1:amazon 2:eBay 3:wish 4:aliexpress")
    private Integer platform;

    @ApiModelProperty(value = "名称")
    private String styleTypeName;

    @ApiModelProperty(value = "风格类型描述")
    private String remark;

    @ApiModelProperty(value = "是否系统")
    private Boolean systemIs;

    @ApiModelProperty(value = "品连账号")
    private String plAccount;

    @ApiModelProperty(value = "创建者")
    private Long createId;

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
     * This field corresponds to the database table publish_style_type
     *
     * @mbg.generated 2019-04-19 17:58:40
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public String getStyleTypeName() {
        return styleTypeName;
    }

    public void setStyleTypeName(String styleTypeName) {
        this.styleTypeName = styleTypeName == null ? null : styleTypeName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getSystemIs() {
        return systemIs;
    }

    public void setSystemIs(Boolean systemIs) {
        this.systemIs = systemIs;
    }

    public String getPlAccount() {
        return plAccount;
    }

    public void setPlAccount(String plAccount) {
        this.plAccount = plAccount == null ? null : plAccount.trim();
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