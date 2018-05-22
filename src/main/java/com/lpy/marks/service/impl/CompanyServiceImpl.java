package com.lpy.register.service.impl;

import com.lpy.register.dao.CompanyDao;
import com.lpy.register.model.Company;
import com.lpy.register.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return companyDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Company record) {
        return companyDao.insert(record);
    }

    @Override
    public int insertSelective(Company record) {
        return companyDao.insertSelective(record);
    }

    @Override
    public Company selectByPrimaryKey(Integer id) {
        return companyDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Company record) {
        return companyDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Company record) {
        return companyDao.updateByPrimaryKey(record);
    }
}
