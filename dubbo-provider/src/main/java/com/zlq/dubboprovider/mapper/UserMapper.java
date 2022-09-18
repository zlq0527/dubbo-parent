package com.zlq.dubboprovider.mapper;

import com.zlq.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper{
    User selectbyName(String username);

    int  selectbyId();

    List<User> getAllUsers();
}
