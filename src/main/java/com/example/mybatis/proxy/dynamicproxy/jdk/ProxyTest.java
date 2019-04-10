package com.example.mybatis.proxy.dynamicproxy.jdk;

import com.example.mybatis.proxy.dynamicproxy.PerInterface;
import com.example.mybatis.proxy.dynamicproxy.Person;

/**
 * @Author: dupeng
 * @Date: 2019/4/9 17:26
 * @Version 1.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        PerInterface person = InsprProxy.getNewProxy(new Person());
        person.getAge(6);
        person.getNumber(17);
    }
}
