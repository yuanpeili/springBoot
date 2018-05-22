package com.lpy.marks.service.impl;

import com.lpy.marks.dao.ApplyInfoDao;
import com.lpy.marks.model.ApplyInfo;
import com.lpy.marks.service.ApplyInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplyInfoServiceImpl implements ApplyInfoService {

    @Autowired
    private ApplyInfoDao applyInfoDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return applyInfoDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ApplyInfo record) {
        return applyInfoDao.insert(record);
    }

    @Override
    public int insertSelective(ApplyInfo record) {
        return applyInfoDao.insertSelective(record);
    }

    @Override
    public ApplyInfo selectByPrimaryKey(Integer id) {
        return applyInfoDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ApplyInfo record) {
        return applyInfoDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ApplyInfo record) {
        return applyInfoDao.updateByPrimaryKey(record);
    }
}
