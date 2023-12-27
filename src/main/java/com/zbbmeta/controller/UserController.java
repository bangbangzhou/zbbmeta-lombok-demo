package com.zbbmeta.controller;

import com.zbbmeta.entity.User;
import com.zbbmeta.service.UserService;
import org.apache.ibatis.reflection.property.PropertyNamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author springboot葵花宝典
 * @description: TODO
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/test")
    public void getTest(){

        String isName = "isName";
        String getName = "getName";
        String getnMetaType = "getsName";
        String getNMetaType = "getSName";

        Stream.of(isName,getName,getnMetaType,getNMetaType)
                .forEach(methodName->System.out.println("方法名字是:"+methodName+" 属性名字:"+ PropertyNamer.methodToProperty(methodName)));

    }

    @GetMapping
    public List<User> getUsers(){

        String isName = "isName";
        String getName = "getName";
        String getnMetaType = "getsName";
        String getNMetaType = "getSName";

        Stream.of(isName,getName,getnMetaType,getNMetaType)
                .forEach(methodName->System.out.println("方法名字是:"+methodName+" 属性名字:"+ PropertyNamer.methodToProperty(methodName)));

        List<User> list = userService.getUsers();
        return list;
    }
}
