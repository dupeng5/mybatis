package com.example.mybatis;

import com.example.mybatis.common.zookeeper.ZkClient;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@MapperScan("com.example.mybatis.view.mapper")
@ComponentScan(basePackages = { "com.example.mybatis.view","com.example.mybatis.common"})
@EnableCaching
public class MybatisApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(MybatisApplication.class, args);
    }

}
