package com.xhw.springbootmybatis.controller;

import com.xhw.springbootmybatis.mapper.UserMapper;
import com.xhw.springbootmybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("users")
    @ResponseBody
    public List<User> getUserList(){
        return userMapper.getUserlist();
    }
}
