package com.rondaful.cloud.user.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class NewSupplierCompanyinfo implements Serializable {
    @ApiModelProperty(value = "")
    private Integer id;

    @ApiModelProperty(value = "供应商用户id")
    private Integer userId;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "注册区域")
    private String regArea;

    @ApiModelProperty(value = "注册地址")
    private String regAddress;

    @ApiModelProperty(value = "统一信用代码")
    private String creditCode;

    @ApiModelProperty(value = "成立日期")
    private String companyCreateDate;

    @ApiModelProperty(value = "经营期限")
    private String operatingPeriod;

    @ApiModelProperty(value = "公司规模")
    private String companyScale;

    @ApiModelProperty(value = "法人名称")
    private String legalpersonName;

    @ApiModelProperty(value = "法人身份证")
    private String idCard;

    @ApiModelProperty(value = "身份证正面")
    private String idCardFImage;

    @ApiModelProperty(value = "身份证反面")
    private String idCardRImage;

    @ApiModelProperty(value = "营业执照")
    private String businessLicense;

    @ApiModelProperty(value = "公司简介")
    private String companyProfile;

    @ApiModelProperty(value = "月营业额")
    private String monthlyTurnover;

    @ApiModelProperty(value = "品牌授权书")
    private String brandLicensing;

    @ApiModelProperty(value = "其他证书")
    private String otherCertificates;

    @ApiModelProperty(value = "主营类目")
    private String mainCategory;

    @ApiModelProperty(value = "退货国家地址")
    private String quitCountry;

    @ApiModelProperty(value = "退货地址")
    private String quiteAddress;

    @ApiModelProperty(value = "退货邮编")
    private String quitPostCode;

    @ApiModelProperty(value = "退货联系人姓名")
    private String quitName;

    @ApiModelProperty(value = "退货联系人座机")
    private String quitMobile;

    @ApiModelProperty(value = "退货手机")
    private String quitPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_supplier_companyinfo
     *
     * @mbg.generated 2019-05-05 16:32:02
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getRegArea() {
        return regArea;
    }

    public void setRegArea(String regArea) {
        this.regArea = regArea == null ? null : regArea.trim();
    }

    public String getRegAddress() {
        return regAddress;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress == null ? null : regAddress.trim();
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode == null ? null : creditCode.trim();
    }

    public String getCompanyCreateDate() {
        return companyCreateDate;
    }

    public void setCompanyCreateDate(String companyCreateDate) {
        this.companyCreateDate = companyCreateDate == null ? null : companyCreateDate.trim();
    }

    public String getOperatingPeriod() {
        return operatingPeriod;
    }

    public void setOperatingPeriod(String operatingPeriod) {
        this.operatingPeriod = operatingPeriod == null ? null : operatingPeriod.trim();
    }

    public String getCompanyScale() {
        return companyScale;
    }

    public void setCompanyScale(String companyScale) {
        this.companyScale = companyScale == null ? null : companyScale.trim();
    }

    public String getLegalpersonName() {
        return legalpersonName;
    }

    public void setLegalpersonName(String legalpersonName) {
        this.legalpersonName = legalpersonName == null ? null : legalpersonName.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getIdCardFImage() {
        return idCardFImage;
    }

    public void setIdCardFImage(String idCardFImage) {
        this.idCardFImage = idCardFImage == null ? null : idCardFImage.trim();
    }

    public String getIdCardRImage() {
        return idCardRImage;
    }

    public void setIdCardRImage(String idCardRImage) {
        this.idCardRImage = idCardRImage == null ? null : idCardRImage.trim();
    }

    public String getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense == null ? null : businessLicense.trim();
    }

    public String getCompanyProfile() {
        return companyProfile;
    }

    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile == null ? null : companyProfile.trim();
    }

    public String getMonthlyTurnover() {
        return monthlyTurnover;
    }

    public void setMonthlyTurnover(String monthlyTurnover) {
        this.monthlyTurnover = monthlyTurnover == null ? null : monthlyTurnover.trim();
    }

    public String getBrandLicensing() {
        return brandLicensing;
    }

    public void setBrandLicensing(String brandLicensing) {
        this.brandLicensing = brandLicensing == null ? null : brandLicensing.trim();
    }

    public String getOtherCertificates() {
        return otherCertificates;
    }

    public void setOtherCertificates(String otherCertificates) {
        this.otherCertificates = otherCertificates == null ? null : otherCertificates.trim();
    }

    public String getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(String mainCategory) {
        this.mainCategory = mainCategory == null ? null : mainCategory.trim();
    }

    public String getQuitCountry() {
        return quitCountry;
    }

    public void setQuitCountry(String quitCountry) {
        this.quitCountry = quitCountry;
    }

    public String getQuiteAddress() {
        return quiteAddress;
    }

    public void setQuiteAddress(String quiteAddress) {
        this.quiteAddress = quiteAddress == null ? null : quiteAddress.trim();
    }

    public String getQuitPostCode() {
        return quitPostCode;
    }

    public void setQuitPostCode(String quitPostCode) {
        this.quitPostCode = quitPostCode == null ? null : quitPostCode.trim();
    }

    public String getQuitName() {
        return quitName;
    }

    public void setQuitName(String quitName) {
        this.quitName = quitName == null ? null : quitName.trim();
    }

    public String getQuitMobile() {
        return quitMobile;
    }

    public void setQuitMobile(String quitMobile) {
        this.quitMobile = quitMobile == null ? null : quitMobile.trim();
    }

    public String getQuitPhone() {
        return quitPhone;
    }

    public void setQuitPhone(String quitPhone) {
        this.quitPhone = quitPhone == null ? null : quitPhone.trim();
    }
}