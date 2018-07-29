package service.impl;

import dao.JobInfoMapper;
import model.JobInfo;
import model.JobInfo;
import model.input.JobInfoQuery;
import model.input.JobInfoQuery;
import org.springframework.stereotype.Service;
import service.JobInfoService;

import javax.annotation.Resource;

/**
 * @author sandu-lipeiyuan
 */
@Service
public class JobInfoServiceImpl implements JobInfoService {

    @Resource
    private JobInfoMapper jobInfoMapper;

    @Override
    public int countByOption(JobInfoQuery example) {
        return jobInfoMapper.countByOption(example);
    }

    @Override
    public int selectByOption(JobInfoQuery example) {
        return jobInfoMapper.selectByOption(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return jobInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(JobInfo record) {
        return jobInfoMapper.insertSelective(record);
    }

    @Override
    public JobInfo selectByPrimaryKey(Integer id) {
        return jobInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(JobInfo record) {
        return jobInfoMapper.updateByPrimaryKeySelective(record);
    }
}
