package service;

import com.github.pagehelper.PageInfo;
import model.BusinessDict;
import model.input.BusinessDictQuery;

import java.util.List;

public interface BusinessDictService {
    int countByOption(BusinessDictQuery example);

    List<BusinessDict> selectByOption(BusinessDictQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(BusinessDict record);

    BusinessDict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessDict record);

    PageInfo<BusinessDict> pageSelectByOption(BusinessDictQuery example, Integer pageNo, Integer pageSize);
}