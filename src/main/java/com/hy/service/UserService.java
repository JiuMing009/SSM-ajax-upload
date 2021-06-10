package com.hy.service;

import com.hy.entity.User;

public interface UserService {

    //回显
    public User byUsername(String username);

    //编辑
    public int updateUser(User user);
}
