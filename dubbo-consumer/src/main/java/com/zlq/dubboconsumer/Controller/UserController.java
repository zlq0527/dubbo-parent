package com.zlq.dubboconsumer.Controller;

import com.zlq.entity.User;
import com.zlq.resultcommon.ResultData;
import com.zlq.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class UserController {
    @DubboReference(check = false)
    UserService userService;

    @RequestMapping("/getUserCount")
    public int getUser() {
        int count = userService.selectUserbyId();
        return count;
    }

    @RequestMapping("/getuserbyName/{username}")
    public User getUserByName(@PathVariable String username) {
        User user = userService.selectByUsername(username);
        return user;
    }

    @RequestMapping("/gettime")
    public String getTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME).toString();
    }

    @RequestMapping("/getallusers")
    public ResultData getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResultData().success(users);
    }
}
