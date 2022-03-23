package com.nuedu.controller;


import com.nuedu.pojo.User;
import com.nuedu.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    IUserService userService;

    @GetMapping("/list")
    List<User> list(Integer id){
        System.out.println(id);
        return userService.list();
    }

}
