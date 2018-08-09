package service;

import com.github.pagehelper.PageInfo;
import model.Company;
import model.JobInfo;
import model.input.JobInfoQuery;

import java.util.List;

public interface JobInfoService {
    int countByOption(JobInfoQuery example);

    List<JobInfo> selectByOption(JobInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(JobInfo record);

    JobInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfo record);

    PageInfo<JobInfo> pageSelectByOption(JobInfoQuery example, Integer pageNo, Integer pageSize);
}