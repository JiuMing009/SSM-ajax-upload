package com.hy.mapper;

import com.hy.entity.User;

public interface UserMapper {

    //回显
    public User byUsername(String username);

    //编辑
    public int updateUser(User user);
}
