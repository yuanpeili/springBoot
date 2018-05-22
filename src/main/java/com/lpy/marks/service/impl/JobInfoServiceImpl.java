package com.lpy.marks.service.impl;

import com.lpy.marks.dao.JobInfoDao;
import com.lpy.marks.model.JobInfo;
import com.lpy.marks.service.JobInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobInfoServiceImpl implements JobInfoService {

    @Autowired
    private JobInfoDao jobInfoDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jobInfoDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(JobInfo record) {
        return jobInfoDao.insert(record);
    }

    @Override
    public int insertSelective(JobInfo record) {
        return jobInfoDao.insertSelective(record);
    }

    @Override
    public JobInfo selectByPrimaryKey(Integer id) {
        return jobInfoDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(JobInfo record) {
        return jobInfoDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(JobInfo record) {
        return jobInfoDao.updateByPrimaryKey(record);
    }
}
