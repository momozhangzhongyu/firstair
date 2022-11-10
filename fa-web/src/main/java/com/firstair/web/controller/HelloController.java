package com.firstair.web.controller;

import com.firstair.entity.User;
import com.firstair.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    public String hello(){
        List<User> list = userMapper.selectList(null);
        System.out.println(list.size());
        return "hello world!";
    }
}
