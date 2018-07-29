package service.impl;

import dao.CityMapper;
import model.City;
import model.input.CityQuery;
import org.springframework.stereotype.Service;
import service.CityService;

import javax.annotation.Resource;

/**
 * @author m1760
 */
@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityMapper cityMapper;

    @Override
    public int countByOption(CityQuery example) {
        return cityMapper.countByOption(example);
    }

    @Override
    public int selectByOption(CityQuery example) {
        return cityMapper.selectByOption(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(City record) {
        return cityMapper.insertSelective(record);
    }

    @Override
    public City selectByPrimaryKey(Integer id) {
        return cityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(City record) {
        return cityMapper.updateByPrimaryKeySelective(record);
    }
}
