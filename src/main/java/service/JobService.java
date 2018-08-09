package service;

import com.github.pagehelper.PageInfo;
import model.Job;
import model.JobInfo;
import model.input.JobQuery;

import java.util.List;

public interface JobService {
    int countByOption(JobQuery example);

    List<Job> selectByOption(JobQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Job record);

    Job selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Job record);

    PageInfo<Job> pageSelectByOption(JobQuery example, Integer pageNo, Integer pageSize);
}