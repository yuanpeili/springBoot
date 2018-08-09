package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.JobMapper;
import model.Job;
import model.input.JobQuery;
import model.input.UserQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import service.JobService;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

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
    public List<Job> selectByOption(JobQuery example) {
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

    @Override
    public PageInfo<Job> pageSelectByOption(JobQuery example, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Job> jobList = jobMapper.selectByOption(example);
        if(CollectionUtils.isEmpty(jobList)){
            return new PageInfo<>(Collections.EMPTY_LIST);
        }
        return new PageInfo<>(jobList);
    }
}
