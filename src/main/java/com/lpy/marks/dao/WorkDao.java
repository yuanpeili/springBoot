package com.lpy.register.dao;

import com.lpy.register.model.Work;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Work record);

    int insertSelective(Work record);

    Work selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKey(Work record);
}