package service;

import model.Company;
import model.input.CompanyQuery;

public interface CompanyService {
    int countByOption(CompanyQuery example);

    int selectByOption(CompanyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);
}