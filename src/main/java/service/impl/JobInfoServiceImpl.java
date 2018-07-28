package service.impl;

import model.JobInfo;
import model.input.JobInfoQuery;
import org.springframework.stereotype.Service;
import service.JobInfoService;

@Service
public class JobInfoServiceImpl implements JobInfoService {

    @Override
    public int countByOption(JobInfoQuery example) {
        return 0;
    }

    @Override
    public int selectByOption(JobInfoQuery example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertSelective(JobInfo record) {
        return 0;
    }

    @Override
    public JobInfo selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(JobInfo record) {
        return 0;
    }
}
