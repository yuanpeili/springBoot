package dao;

import model.Company;
import model.input.CompanyQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyMapper {
    int countByOption(CompanyQuery example);

    List<Company> selectByOption(CompanyQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);
}