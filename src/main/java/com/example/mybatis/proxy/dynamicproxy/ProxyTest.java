package com.example.mybatis.proxy.dynamicproxy;

/**
 * @Author: dupeng
 * @Date: 2019/4/9 17:26
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        Person person = (Person)InsprProxy.getNewProxy((Object)new Person());
        person.getAge(6);
        person.getNumber(17);
    }
}
