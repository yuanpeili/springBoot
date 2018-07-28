package service;

import model.JobInfo;
import model.input.JobInfoQuery;

public interface JobInfoService {
    int countByOption(JobInfoQuery example);

    int selectByOption(JobInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(JobInfo record);

    JobInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfo record);
}