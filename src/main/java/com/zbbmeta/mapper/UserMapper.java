package com.zbbmeta.mapper;

import com.zbbmeta.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
* @author zbb
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-12-28 00:26:18
* @Entity com.beta.entity.User
*/
@Mapper
public interface UserMapper  {
    List<User> getUsers();
}




