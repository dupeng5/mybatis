package com.example.mybatis.proxy.dynamicproxy;

public class Person implements PerInterface{
    @Override
    public String getAge(int i){
        return "PresonAge="+i;
    }
    @Override
    public String getNumber(int i){
        return "PresonNum"+i;
    }
}
