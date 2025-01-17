package com.rondaful.cloud.user.model.dto;

import java.io.Serializable;

/**
 * @Author: xqq
 * @Date: 2019/6/22
 * @Description:
 */
public class KeyValueDTO implements Serializable {
    private static final long serialVersionUID = -877318526810850375L;

    private String key;

    private String name;

    public KeyValueDTO(){}

    public KeyValueDTO(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
