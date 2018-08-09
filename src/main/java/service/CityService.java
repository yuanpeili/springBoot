package service;

import com.github.pagehelper.PageInfo;
import model.BusinessDict;
import model.City;
import model.input.CityQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CityService {
    int countByOption(CityQuery example);

    List<City> selectByOption(CityQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    PageInfo<City> pageSelectByOption(CityQuery example, Integer pageNo, Integer pageSize);
}