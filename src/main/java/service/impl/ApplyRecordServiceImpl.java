package service.impl;

import dao.ApplyRecordMapper;
import model.ApplyRecord;
import model.input.ApplyRecordQuery;
import org.springframework.stereotype.Service;
import service.ApplyRecordService;

import javax.annotation.Resource;

/**
 * @author m1760
 */
@Service
public class ApplyRecordServiceImpl implements ApplyRecordService {


    @Resource
    private ApplyRecordMapper applyRecordMapper;

    @Override
    public int countByOption(ApplyRecordQuery example) {
        return applyRecordMapper.countByOption(example);
    }

    @Override
    public int selectByOption(ApplyRecordQuery example) {
        return applyRecordMapper.selectByOption(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return applyRecordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(ApplyRecord record) {
        return applyRecordMapper.insertSelective(record);
    }

    @Override
    public ApplyRecord selectByPrimaryKey(Integer id) {
        return applyRecordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ApplyRecord record) {
        return applyRecordMapper.updateByPrimaryKeySelective(record);
    }
}
