package com.example.mybatis.jdk8newFunction.streamapi;

import lombok.Data;

/**
 * @Author: dupeng5
 * @Date: 2019/4/16 14:17
 * @Version 1.0
 */
@Data
public class Person {
    private String name;
    private int age;
    public Person(){}
    public Person(String name,int age){this.name=name;this.age=age;}
    //此处修改测试去重
//    public boolean equals(Object anObject) {
//        Person a = (Person)anObject;
//        return  this.name.equals(a.getName());
//    }
//    public int  hashCode(){
//        return this.name.hashCode();
//    }
}
