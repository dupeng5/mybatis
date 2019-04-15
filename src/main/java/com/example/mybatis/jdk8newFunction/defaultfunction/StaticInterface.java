package com.example.mybatis.jdk8newFunction.defaultfunction;

/**
 * @Author: dupeng5
 * @Date: 2019/4/15 15:34
 * @Version 1.0
 */
public interface StaticInterface {
    //jdk8 static修饰的支持
    static void printlnMessage(){
        System.out.println("StaticInterface printlnMessage()");
    }
}
