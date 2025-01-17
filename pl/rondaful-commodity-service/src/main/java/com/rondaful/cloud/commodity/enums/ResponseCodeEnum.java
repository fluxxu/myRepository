package com.rondaful.cloud.commodity.enums;

import com.rondaful.cloud.common.enums.ResponseCodeEnumSupper;

public enum ResponseCodeEnum implements ResponseCodeEnumSupper {

    /**
     * 定义返回码
     * */

    RETURN_CODE_100001("100001","用户名或密码错误"),
    RETURN_CODE_100400("100400","请求参数错误"),
    RETURN_CODE_100401("100401","权限不足"),
    RETURN_CODE_100403("100403","参数不允许为空"),
    RETURN_CODE_100406("100406","未登录"),

    RETURN_CODE_100200("100200","请求成功"),
    RETURN_CODE_100500("100500","系统异常"),
    
    
    //对外公司返回
    SP_200403("200403","请求参数每页行数不能为空"),
    SP_200402("200402","请求参数页码不能为空"),
    SP_200401("200401","权限不足");





    private String code;
    private String msg;
    private ResponseCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public String getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }

}
