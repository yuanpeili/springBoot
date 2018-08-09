package dao;

import model.BusinessDict;
import model.input.BusinessDictQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusinessDictMapper {
    int countByOption(BusinessDictQuery example);

    List<BusinessDict> selectByOption(BusinessDictQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(BusinessDict record);

    BusinessDict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessDict record);
}