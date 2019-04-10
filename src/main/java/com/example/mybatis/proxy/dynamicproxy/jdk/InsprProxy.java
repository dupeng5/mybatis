package com.example.mybatis.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: dupeng5
 * @Date: 2019/4/10 10:17
 * @Version 1.0
 */
public class InsprProxy<T> implements InvocationHandler {

    private T subject;
    public InsprProxy(T subject){
        this.subject =subject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用开始");
        Object a = null;
        if("getAge".equals(method.getName())){
            System.out.println("这里是getAge方法"+String.valueOf(args[0]));

            a = method.invoke(subject,args);
        }
        if("getNumber".equals(method.getName())){
            System.out.println("这里是getNumber方法"+String.valueOf(args[0]));
            a = method.invoke(subject,args);
        }
        System.out.println("调用结束");
        return a;
    }

    public static  <T>T getNewProxy(T t){
        ClassLoader load = t.getClass().getClassLoader();
        Class<?>[] interfaces =t.getClass().getInterfaces();
        InsprProxy a = new InsprProxy<T>(t);
        return  (T)Proxy.newProxyInstance(load, interfaces, a);
    }
}
