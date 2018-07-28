package service.impl;

import model.Company;
import model.input.CompanyQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Override
    public int countByOption(CompanyQuery example) {
        return 0;
    }

    @Override
    public int selectByOption(CompanyQuery example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertSelective(Company record) {
        return 0;
    }

    @Override
    public Company selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Company record) {
        return 0;
    }
}
