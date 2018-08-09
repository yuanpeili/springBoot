package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.BusinessDictMapper;
import model.ApplyRecord;
import model.BusinessDict;
import model.input.ApplyRecordQuery;
import model.input.BusinessDictQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import service.BusinessDictService;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @author m1760
 */
@Service
public class BusinessDictServiceImpl implements BusinessDictService {

    @Resource
    private BusinessDictMapper businessDictMapper;

    @Override
    public int countByOption(BusinessDictQuery example) {
        return businessDictMapper.countByOption(example);
    }

    @Override
    public List<BusinessDict> selectByOption(BusinessDictQuery example) {
        return businessDictMapper.selectByOption(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return businessDictMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(BusinessDict record) {
        return businessDictMapper.insertSelective(record);
    }

    @Override
    public BusinessDict selectByPrimaryKey(Integer id) {
        return businessDictMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BusinessDict record) {
        return businessDictMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public PageInfo<BusinessDict> pageSelectByOption(BusinessDictQuery example, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<BusinessDict> businessDictList = businessDictMapper.selectByOption(example);
        if(CollectionUtils.isEmpty(businessDictList)){
            return new PageInfo<>(Collections.EMPTY_LIST);
        }
        return new PageInfo<>(businessDictList);
    }
}
