package service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import dao.UserMapper;
import model.Company;
import model.User;
import model.input.CompanyQuery;
import model.input.UserQuery;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import service.UserService;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @author sandu-lipeiyuan
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int countByOption(UserQuery example) {
        return userMapper.countByOption(example);
    }

    @Override
    public List<User> selectByOption(UserQuery example) {
        return userMapper.selectByOption(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public PageInfo<User> pageSelectByOption(UserQuery example, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<User> userList = userMapper.selectByOption(example);
        if(CollectionUtils.isEmpty(userList)){
            return new PageInfo<>(Collections.EMPTY_LIST);
        }
        return new PageInfo<>(userList);
    }
}
