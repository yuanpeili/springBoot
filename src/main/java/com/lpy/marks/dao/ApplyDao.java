package com.lpy.register.dao;


import com.lpy.register.model.Apply;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Apply record);

    int insertSelective(Apply record);

    Apply selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Apply record);

    int updateByPrimaryKey(Apply record);
}