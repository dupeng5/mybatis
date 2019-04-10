package com.example.mybatis.proxy.dynamicproxy;

public class Person implements PerInterface{
    @Override
    public String getAge(int i){
        String a = "PresonAge="+i;
        System.out.println(a);
        return a;
    }
    @Override
    public String getNumber(int i){
        String a = "PresonAge="+i;
        System.out.println(a);
        return a;
    }
}
