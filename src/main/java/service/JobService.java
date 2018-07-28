package service;

import model.Job;
import model.input.JobQuery;

public interface JobService {
    int countByOption(JobQuery example);

    int selectByOption(JobQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job record);
}