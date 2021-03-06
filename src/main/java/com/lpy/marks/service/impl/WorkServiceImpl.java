package com.lpy.marks.service.impl;

import com.lpy.marks.dao.WorkDao;
import com.lpy.marks.model.Work;
import com.lpy.marks.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkServiceImpl implements WorkService {

    @Autowired
    private WorkDao workDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return workDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Work record) {
        return workDao.insert(record);
    }

    @Override
    public int insertSelective(Work record) {
        return workDao.insertSelective(record);
    }

    @Override
    public Work selectByPrimaryKey(Integer id) {
        return workDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Work record) {
        return workDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Work record) {
        return workDao.updateByPrimaryKey(record);
    }
}
