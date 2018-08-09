package service;

import com.github.pagehelper.PageInfo;
import common.ResultDTO;
import model.ApplyRecord;
import model.input.ApplyRecordQuery;

import java.util.List;

public interface ApplyRecordService {
    int countByOption(ApplyRecordQuery example);

    List<ApplyRecord> selectByOption(ApplyRecordQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(ApplyRecord record);

    ApplyRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplyRecord record);

    PageInfo<ApplyRecord> pageSelectByOption(ApplyRecordQuery example, Integer pageNo, Integer pageSize);

}