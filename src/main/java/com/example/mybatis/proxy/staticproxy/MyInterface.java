package com.example.mybatis.proxy.staticproxy;

/**
 * @Author: dupeng5
 * @Date: 2019/4/24 9:36
 * @Version 1.0
 */
public interface MyInterface {
    default String doTask(){
        System.out.println("run 运行前");
        String logback = run();
        System.out.println("run 运行后");
        return logback;
    }
    public String run();
}
