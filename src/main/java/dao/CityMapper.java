package dao;

import model.City;
import model.input.CityQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityMapper {
    int countByOption(CityQuery example);

    List<City> selectByOption(CityQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);
}