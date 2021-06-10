package com.hy.service;

import com.hy.entity.User;
import com.hy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    //回显
    @Override
    public User byUsername(String username) {
        return userMapper.byUsername(username);
    }

    //更换头像
    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
