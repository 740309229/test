package com.manye.www.mapper;

import com.manye.www.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    /*@Select("SELECT id,username,password  FROM user")
    @Results(id = "resultMap",value = {
            @Result(column = "id",property = "id"),
            @Result(column = "username",property = "username"),
            @Result(column = "password",property = "password")
    })*/
    public List<User> list();

    /*@Select("SELECT id,username,password  FROM user WHERE id = #(id)")
    @ResultMap("resultMap")*/
    public User get(long id);

    public void save(User user);
}
