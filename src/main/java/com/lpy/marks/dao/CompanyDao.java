package com.lpy.register.dao;


import com.lpy.register.model.Company;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}