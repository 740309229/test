package com.manye.www.controller;

import com.manye.www.dao.IUserDao;
import com.manye.www.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserDao userDao;


    @RequestMapping("/list")
    public List<User> list(){
        System.out.println(userDao.list());
        return userDao.list();
    }

    @RequestMapping("/get")
    public User get(long id){
        System.out.println(userDao.get(id));
        return userDao.get(id);
    }

    @RequestMapping("/save")
    public void save(){
        userDao.save(new User(120,"白","17"));

    }
}
