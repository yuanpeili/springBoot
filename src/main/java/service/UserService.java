package service;

import model.User;
import model.input.UserQuery;

public interface UserService {
    int countByOption(UserQuery example);

    int selectByOption(UserQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);
}