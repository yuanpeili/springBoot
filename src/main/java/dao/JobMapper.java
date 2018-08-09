package dao;

import model.Job;
import model.User;
import model.input.JobQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobMapper {
    int countByOption(JobQuery example);

    List<Job> selectByOption(JobQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job record);
}