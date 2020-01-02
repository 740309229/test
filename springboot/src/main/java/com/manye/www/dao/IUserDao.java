package com.manye.www.dao;

import com.manye.www.domain.User;

import java.util.List;

public interface IUserDao {
    public List<User> list();
    public User get(long id);
    public void save(User user);
}
