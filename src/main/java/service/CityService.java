package service;

import model.City;
import model.input.CityQuery;
import org.springframework.stereotype.Repository;

public interface CityService {
    int countByOption(CityQuery example);

    int selectByOption(CityQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);
}