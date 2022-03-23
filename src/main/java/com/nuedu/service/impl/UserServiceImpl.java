package com.nuedu.service.impl;

import com.nuedu.pojo.User;
import com.nuedu.mapper.UserMapper;
import com.nuedu.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
