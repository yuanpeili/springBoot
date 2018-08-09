package dao;

import model.User;
import model.input.UserQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    int countByOption(UserQuery example);

    List<User> selectByOption(UserQuery example);

    int deleteByPrimaryKey(Integer id);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);
}