package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.CompanyMapper;
import model.City;
import model.Company;
import model.input.CityQuery;
import model.input.CompanyQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import service.CompanyService;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

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
    public List<Company> selectByOption(CompanyQuery example) {
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

    @Override
    public PageInfo<Company> pageSelectByOption(CompanyQuery example, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Company> companyList = companyMapper.selectByOption(example);
        if(CollectionUtils.isEmpty(companyList)){
            return new PageInfo<>(Collections.EMPTY_LIST);
        }
        return new PageInfo<>(companyList);
    }
}
