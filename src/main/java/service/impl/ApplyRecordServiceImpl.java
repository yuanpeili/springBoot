package service.impl;

import model.ApplyRecord;
import model.input.ApplyRecordQuery;
import org.springframework.stereotype.Service;
import service.ApplyRecordService;

/**
 * @author m1760
 */
@Service
public class ApplyRecordServiceImpl implements ApplyRecordService {


    @Override
    public int countByOption(ApplyRecordQuery example) {
        return 0;
    }

    @Override
    public int selectByOption(ApplyRecordQuery example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertSelective(ApplyRecord record) {
        return 0;
    }

    @Override
    public ApplyRecord selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ApplyRecord record) {
        return 0;
    }
}
