package com.lpy.marks.service.impl;

import com.lpy.marks.dao.BusinessDictDao;
import com.lpy.marks.model.BusinessDict;
import com.lpy.marks.service.BusinessDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessDictServiceImpl implements BusinessDictService {

    @Autowired
    private BusinessDictDao businessDictDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return businessDictDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BusinessDict record) {
        return businessDictDao.insert(record);
    }

    @Override
    public int insertSelective(BusinessDict record) {
        return businessDictDao.insertSelective(record);
    }

    @Override
    public BusinessDict selectByPrimaryKey(Integer id) {
        return businessDictDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BusinessDict record) {
        return businessDictDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(BusinessDict record) {
        return businessDictDao.updateByPrimaryKey(record);
    }
}
