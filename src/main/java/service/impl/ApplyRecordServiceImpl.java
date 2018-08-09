package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.ApplyRecordMapper;
import model.ApplyRecord;
import model.input.ApplyRecordQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import service.ApplyRecordService;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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
    public List<ApplyRecord> selectByOption(ApplyRecordQuery example) {
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

    @Override
    public PageInfo<ApplyRecord> pageSelectByOption(ApplyRecordQuery example, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<ApplyRecord> applyRecordList = applyRecordMapper.selectByOption(example);
        if(CollectionUtils.isEmpty(applyRecordList)){
            return new PageInfo<>(Collections.EMPTY_LIST);
        }
        return new PageInfo<>(applyRecordList);
    }
}
