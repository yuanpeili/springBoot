package com.lpy.register.service;


import com.lpy.register.model.BusinessDict;

public interface BusinessDictService {
    int deleteByPrimaryKey(Integer id);

    int insert(BusinessDict record);

    int insertSelective(BusinessDict record);

    BusinessDict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessDict record);

    int updateByPrimaryKey(BusinessDict record);
}