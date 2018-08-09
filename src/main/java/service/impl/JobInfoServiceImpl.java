package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.JobInfoMapper;
import model.JobInfo;
import model.input.JobInfoQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import service.JobInfoService;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

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
    public List<JobInfo> selectByOption(JobInfoQuery example) {
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

    @Override
    public PageInfo<JobInfo> pageSelectByOption(JobInfoQuery example, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<JobInfo> jobInfoList = jobInfoMapper.selectByOption(example);
        if(CollectionUtils.isEmpty(jobInfoList)){
            return new PageInfo<>(Collections.EMPTY_LIST);
        }
        return new PageInfo<>(jobInfoList);
    }
}
