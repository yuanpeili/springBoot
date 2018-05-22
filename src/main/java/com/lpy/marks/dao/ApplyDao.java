package com.lpy.marks.dao;


import com.lpy.marks.model.Apply;
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