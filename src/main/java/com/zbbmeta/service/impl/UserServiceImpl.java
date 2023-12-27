package com.zbbmeta.service.impl;


import com.zbbmeta.entity.User;
import com.zbbmeta.service.UserService;
import com.zbbmeta.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author zbb
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-12-28 00:26:18
*/
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        return userMapper.getUsers();
    }
}




