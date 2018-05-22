package com.lpy.register.dao;


import com.lpy.register.model.ApplyInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ApplyInfo record);

    int insertSelective(ApplyInfo record);

    ApplyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplyInfo record);

    int updateByPrimaryKey(ApplyInfo record);
}