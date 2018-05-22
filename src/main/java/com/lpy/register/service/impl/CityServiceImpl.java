package com.lpy.register.service.impl;

import com.lpy.register.dao.CityDao;
import com.lpy.register.model.City;
import com.lpy.register.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cityDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(City record) {
        return cityDao.insert(record);
    }

    @Override
    public int insertSelective(City record) {
        return cityDao.insertSelective(record);
    }

    @Override
    public City selectByPrimaryKey(Integer id) {
        return cityDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(City record) {
        return cityDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(City record) {
        return cityDao.updateByPrimaryKey(record);
    }
}
