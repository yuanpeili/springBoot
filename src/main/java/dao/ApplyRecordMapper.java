package dao;

import model.ApplyRecord;
import model.input.ApplyRecordQuery;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplyRecordMapper {
    int countByOption(ApplyRecordQuery example);

    int selectByOption(ApplyRecordQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ApplyRecord record);

    ApplyRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplyRecord record);

}