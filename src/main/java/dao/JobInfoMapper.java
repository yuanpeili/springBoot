package dao;

import model.JobInfo;
import model.input.JobInfoQuery;
import org.springframework.stereotype.Repository;
@Repository
public interface JobInfoMapper {
    int countByOption(JobInfoQuery example);

    int selectByOption(JobInfoQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(JobInfo record);

    JobInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfo record);
}