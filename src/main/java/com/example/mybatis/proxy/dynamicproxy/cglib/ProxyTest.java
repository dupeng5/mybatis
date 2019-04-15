package com.example.mybatis.proxy.dynamicproxy.cglib;

import com.example.mybatis.proxy.dynamicproxy.PersonNoImp;
import org.springframework.cglib.proxy.Enhancer;

public class ProxyTest {
    public static void main(String[] args) {
        MyMethodInterceptor proxy = new MyMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonNoImp.class);
        enhancer.setCallback(proxy);
        PersonNoImp impl = (PersonNoImp)enhancer.create();
        impl.getAge(5);
//        String a = String.valueOf();
//        System.out.println(a);
    }
}
