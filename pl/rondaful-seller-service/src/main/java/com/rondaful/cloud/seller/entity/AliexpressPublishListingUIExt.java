package com.rondaful.cloud.seller.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * 提供给前端使用方便数据回写编辑
 * 实体类对应的数据表为：  aliexpress_publish_listing_ui_ext
 * @author chenhan
 * @date 2019-03-21 18:31:14
 */
@ApiModel(value ="AliexpressPublishListingUIExt")
public class AliexpressPublishListingUIExt implements Serializable {
    @ApiModelProperty(value = "")
    private Long id;

    @ApiModelProperty(value = "")
    private Long listingId;

    @ApiModelProperty(value = "")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date creationTime;

    @ApiModelProperty(value = "前端要求 用此字段保存所有的数据信息")
    private String ext;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aliexpress_publish_listing_ui_ext
     *
     * @mbg.generated 2019-03-21 18:31:14
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

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }
}