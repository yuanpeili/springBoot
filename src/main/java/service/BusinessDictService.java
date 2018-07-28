package service;

import model.BusinessDict;
import model.input.BusinessDictQuery;

public interface BusinessDictService {
    int countByOption(BusinessDictQuery example);

    int selectByOption(BusinessDictQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(BusinessDict record);

    BusinessDict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessDict record);
}