package com.zbbmeta;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author springboot葵花宝典
 * @description: TODO
 */
//@MapperScan("com.zbbmeta.mapper")
@SpringBootApplication
public class LombokApplication {

    public static void main(String[] args) {
        SpringApplication.run(LombokApplication.class,args);
    }
}
