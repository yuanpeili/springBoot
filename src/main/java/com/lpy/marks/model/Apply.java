package com.lpy.register.model;

import java.io.Serializable;

public class Apply implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer jobInfoId;

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

    public Integer getJobInfoId() {
        return jobInfoId;
    }

    public void setJobInfoId(Integer jobInfoId) {
        this.jobInfoId = jobInfoId;
    }
}