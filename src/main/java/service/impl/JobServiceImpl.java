package service.impl;

import model.Job;
import model.input.JobQuery;
import org.springframework.stereotype.Service;
import service.JobService;

@Service
public class JobServiceImpl implements JobService {

    @Override
    public int countByOption(JobQuery example) {
        return 0;
    }

    @Override
    public int selectByOption(JobQuery example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertSelective(Job record) {
        return 0;
    }

    @Override
    public Job selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Job record) {
        return 0;
    }
}
