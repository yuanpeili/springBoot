package com.lpy.register.dao;


import com.lpy.register.model.BusinessDict;

public interface BusinessDictDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BusinessDict record);

    int insertSelective(BusinessDict record);

    BusinessDict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessDict record);

    int updateByPrimaryKey(BusinessDict record);
}