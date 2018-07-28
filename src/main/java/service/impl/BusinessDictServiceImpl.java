package service.impl;

import model.BusinessDict;
import model.input.BusinessDictQuery;
import org.springframework.stereotype.Service;
import service.BusinessDictService;

/**
 * @author m1760
 */
@Service
public class BusinessDictServiceImpl implements BusinessDictService {

    @Override
    public int countByOption(BusinessDictQuery example) {
        return 0;
    }

    @Override
    public int selectByOption(BusinessDictQuery example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertSelective(BusinessDict record) {
        return 0;
    }

    @Override
    public BusinessDict selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(BusinessDict record) {
        return 0;
    }
}
