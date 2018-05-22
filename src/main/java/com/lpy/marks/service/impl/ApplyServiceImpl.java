package com.lpy.marks.service.impl;

import com.lpy.marks.dao.ApplyDao;
import com.lpy.marks.model.Apply;
import com.lpy.marks.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplyServiceImpl implements ApplyService {
    @Autowired
    private ApplyDao applyDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return applyDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Apply record) {
        return applyDao.insert(record);
    }

    @Override
    public int insertSelective(Apply record) {
        return applyDao.insertSelective(record);
    }

    @Override
    public Apply selectByPrimaryKey(Integer id) {
        return applyDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Apply record) {
        return applyDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Apply record) {
        return applyDao.updateByPrimaryKey(record);
    }
}
