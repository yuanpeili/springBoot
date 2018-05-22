package com.lpy.marks.dao;

import com.lpy.marks.model.JobInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface JobInfoDao {
    int deleteByPrimaryKey(Integer id);

    int insert(JobInfo record);

    int insertSelective(JobInfo record);

    JobInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfo record);

    int updateByPrimaryKey(JobInfo record);
}