package com.zlq.dubboprovider.service.impl;

import com.zlq.dubboprovider.mapper.UserMapper;
import com.zlq.entity.User;
import com.zlq.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DubboService
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectByUsername(String username) {
        User user = userMapper.selectbyName(username);
        return user;
    }

    @Override
    public int  selectUserbyId() {
        return userMapper.selectbyId();
    }

    @Override
    public void insertUser(User user) {

    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

}
