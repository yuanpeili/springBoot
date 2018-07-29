package service.impl;

import dao.UserMapper;
import model.User;
import model.User;
import model.input.UserQuery;
import model.input.UserQuery;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;

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
    public int selectByOption(UserQuery example) {
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
}
