package service.impl;

import model.City;
import model.input.CityQuery;
import org.springframework.stereotype.Service;
import service.CityService;

/**
 * @author m1760
 */
@Service
public class CityServiceImpl implements CityService {
    @Override
    public int countByOption(CityQuery example) {
        return 0;
    }

    @Override
    public int selectByOption(CityQuery example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertSelective(City record) {
        return 0;
    }

    @Override
    public City selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(City record) {
        return 0;
    }
}
