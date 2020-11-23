package com.spring.service;

import com.spring.dao.UserMapper;
import com.spring.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

}
