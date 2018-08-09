package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.CityMapper;
import model.City;
import model.City;
import model.input.CityQuery;
import model.input.CityQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import service.CityService;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

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
    public List<City> selectByOption(CityQuery example) {
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

    @Override
    public PageInfo<City> pageSelectByOption(CityQuery example, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<City> cityList = cityMapper.selectByOption(example);
        if(CollectionUtils.isEmpty(cityList)){
            return new PageInfo<>(Collections.EMPTY_LIST);
        }
        return new PageInfo<>(cityList);
    }
}
