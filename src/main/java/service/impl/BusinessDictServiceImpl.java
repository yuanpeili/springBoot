package service.impl;

import dao.BusinessDictMapper;
import model.BusinessDict;
import model.BusinessDict;
import model.input.BusinessDictQuery;
import model.input.BusinessDictQuery;
import org.springframework.stereotype.Service;
import service.BusinessDictService;

import javax.annotation.Resource;

/**
 * @author m1760
 */
@Service
public class BusinessDictServiceImpl implements BusinessDictService {

    @Resource
    private BusinessDictMapper businessDictMapper;

    @Override
    public int countByOption(BusinessDictQuery example) {
        return businessDictMapper.countByOption(example);
    }

    @Override
    public int selectByOption(BusinessDictQuery example) {
        return businessDictMapper.selectByOption(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return businessDictMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(BusinessDict record) {
        return businessDictMapper.insertSelective(record);
    }

    @Override
    public BusinessDict selectByPrimaryKey(Integer id) {
        return businessDictMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BusinessDict record) {
        return businessDictMapper.updateByPrimaryKeySelective(record);
    }
}
