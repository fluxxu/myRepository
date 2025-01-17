package com.rondaful.cloud.supplier.entity.basics;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class WarehouseListAddress implements Serializable {
    @ApiModelProperty(value = "仓库id")
    private Integer id;

    @ApiModelProperty(value = "州/省/郡")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "邮编")
    private String zipCode;

    @ApiModelProperty(value = "联系电话1")
    private String phone1;

    @ApiModelProperty(value = "联系电话2")
    private String phone2;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "收件人名")
    private String userName;

    @ApiModelProperty(value = "收件公司名")
    private String corporationName;

    @ApiModelProperty(value = "版本号")
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_warehouse_list_address
     *
     * @mbg.generated 2019-08-06 09:50:08
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1 == null ? null : phone1.trim();
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName == null ? null : corporationName.trim();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}