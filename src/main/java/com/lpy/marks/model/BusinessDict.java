package com.lpy.register.model;

import java.io.Serializable;

public class BusinessDict implements Serializable {
    private Integer id;

    private String business;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business == null ? null : business.trim();
    }
}