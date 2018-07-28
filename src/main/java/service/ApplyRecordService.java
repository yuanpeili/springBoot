package service;

import model.ApplyRecord;
import model.input.ApplyRecordQuery;
import org.springframework.stereotype.Repository;

public interface ApplyRecordService {
    int countByOption(ApplyRecordQuery example);

    int selectByOption(ApplyRecordQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ApplyRecord record);

    ApplyRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplyRecord record);

}