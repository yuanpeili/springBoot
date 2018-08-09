package dao;

import model.JobInfo;
import model.input.JobInfoQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobInfoMapper {
    int countByOption(JobInfoQuery example);

    List<JobInfo> selectByOption(JobInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(JobInfo record);

    JobInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfo record);
}