package dao;

import com.github.pagehelper.PageInfo;
import model.ApplyRecord;
import model.input.ApplyRecordQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplyRecordMapper {
    int countByOption(ApplyRecordQuery example);

    List<ApplyRecord> selectByOption(ApplyRecordQuery example);



    int deleteByPrimaryKey(Integer id);

    int insertSelective(ApplyRecord record);

    ApplyRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplyRecord record);


}