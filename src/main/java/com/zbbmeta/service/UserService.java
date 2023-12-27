package com.zbbmeta.service;

import com.zbbmeta.entity.User;


import java.util.List;

/**
* @author zbb
* @description 针对表【user】的数据库操作Service
* @createDate 2023-12-28 00:26:18
*/
public interface UserService  {

    List<User> getUsers();
}
