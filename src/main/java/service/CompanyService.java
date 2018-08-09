package service;

import com.github.pagehelper.PageInfo;
import model.Company;
import model.input.CompanyQuery;

import java.util.List;

public interface CompanyService {
    int countByOption(CompanyQuery example);

    List<Company> selectByOption(CompanyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);

    PageInfo<Company> pageSelectByOption(CompanyQuery example, Integer pageNo, Integer pageSize);
}
