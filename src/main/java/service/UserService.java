package service;

import com.github.pagehelper.PageInfo;
import model.User;
import model.input.UserQuery;

import java.util.List;

public interface UserService {
    int countByOption(UserQuery example);

    List<User> selectByOption(UserQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    PageInfo<User> pageSelectByOption(UserQuery example, Integer pageNo, Integer pageSize);
}