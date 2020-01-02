package com.manye.www.dao.impl;

import com.manye.www.dao.IUserDao;
import com.manye.www.domain.User;
import com.manye.www.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements IUserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public User get(long id) {
        return userMapper.get(id);
    }


    public void save(User user) {
        userMapper.save(user);
        int i = 1 / 0;
    }
}
