package dao;

import model.Job;
import model.input.JobQuery;
import org.springframework.stereotype.Repository;
@Repository
public interface JobMapper {
    int countByOption(JobQuery example);

    int selectByOption(JobQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job record);
}