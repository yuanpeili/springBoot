package com.lpy.marks.dao;


import com.lpy.marks.model.BusinessDict;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessDictDao {
    int deleteByPrimaryKey(Integer id);

    int insert(BusinessDict record);

    int insertSelective(BusinessDict record);

    BusinessDict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessDict record);

    int updateByPrimaryKey(BusinessDict record);
}