package service.impl;

import dao.CompanyMapper;
import model.Company;
import model.Company;
import model.input.CompanyQuery;
import model.input.CompanyQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CompanyService;

import javax.annotation.Resource;

/**
 * @author sandu-lipeiyuan
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Resource
    private CompanyMapper companyMapper;

    @Override
    public int countByOption(CompanyQuery example) {
        return companyMapper.countByOption(example);
    }

    @Override
    public int selectByOption(CompanyQuery example) {
        return companyMapper.selectByOption(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return companyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(Company record) {
        return companyMapper.insertSelective(record);
    }

    @Override
    public Company selectByPrimaryKey(Integer id) {
        return companyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Company record) {
        return companyMapper.updateByPrimaryKeySelective(record);
    }
}
