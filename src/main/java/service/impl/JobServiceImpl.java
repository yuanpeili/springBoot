package service.impl;

import dao.JobMapper;
import model.Job;
import model.input.JobQuery;
import org.springframework.stereotype.Service;
import service.JobService;

import javax.annotation.Resource;

/**
 * @author sandu-lipeiyuan
 */
@Service
public class JobServiceImpl implements JobService {
    @Resource
    private JobMapper jobMapper;

    @Override
    public int countByOption(JobQuery example) {
        return jobMapper.countByOption(example);
    }

    @Override
    public int selectByOption(JobQuery example) {
        return jobMapper.selectByOption(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jobMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Job record) {
        return jobMapper.insertSelective(record);
    }

    @Override
    public Job selectByPrimaryKey(Integer id) {
        return jobMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Job record) {
        return jobMapper.updateByPrimaryKeySelective(record);
    }
}
