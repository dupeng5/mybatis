package com.example.mybatis.proxy.dynamicproxy;

public class PersonNoImp {
    public String getAge(int i){
        String a = "PresonAge="+i;
        System.out.println(a);
        return a;
    }
    public String getNumber(int i){
        String a = "PresonNumber="+i;
        System.out.println(a);
        return a;
    }
    public String getMessage(){
        String a = "get The Message";
        System.out.println(a);
        return a;
    }
}
