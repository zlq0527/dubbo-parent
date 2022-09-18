package com.zlq.service;

import com.zlq.entity.User;

import java.util.Collection;
import java.util.List;

public interface UserService {

    User selectByUsername(String username);

    int  selectUserbyId();

    void insertUser(User user);

    List<User> getAllUsers();
}
