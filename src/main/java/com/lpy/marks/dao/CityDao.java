package com.lpy.register.dao;


import com.lpy.register.model.City;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}