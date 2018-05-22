package com.lpy.register.dao;

import com.lpy.register.model.JobInfo;

public interface JobInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(JobInfo record);

    int insertSelective(JobInfo record);

    JobInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfo record);

    int updateByPrimaryKey(JobInfo record);
}