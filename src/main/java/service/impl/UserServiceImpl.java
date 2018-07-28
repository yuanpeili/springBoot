package service.impl;

import model.User;
import model.input.UserQuery;
import org.springframework.stereotype.Service;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public int countByOption(UserQuery example) {
        return 0;
    }

    @Override
    public int selectByOption(UserQuery example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }
}
