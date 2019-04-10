package com.example.mybatis;

import com.example.mybatis.view.entity.ArchitectureStaticData;

import java.text.SimpleDateFormat;

public class InportPOJO {
    private String name;
    private String id;
    private String age;
    public InportPOJO(){
        this.name = "123" ;
        this.id = "123";
        this.age = "123";
    }
    public int getCode(){
        SimpleDateFormat  a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return a.hashCode();
    }
    public void init(String name,String id,String age){
        this.name = name ;
        this.id = id;
        this.age = age;
    }
    public void pri(){
        System.out.println(name+id+age);
    }
}
