package dao;

import model.BusinessDict;
import model.input.BusinessDictQuery;
import org.springframework.stereotype.Repository;
@Repository
public interface BusinessDictMapper {
    int countByOption(BusinessDictQuery example);

    int selectByOption(BusinessDictQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(BusinessDict record);

    BusinessDict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BusinessDict record);
}