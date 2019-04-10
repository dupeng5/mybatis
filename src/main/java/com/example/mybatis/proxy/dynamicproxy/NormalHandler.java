package com.example.mybatis.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态接口类代理
 * @Author: dupeng5
 * @Date: 2019/4/9 17:40
 * @Version 1.0
 */
public class NormalHandler implements InvocationHandler {
//    private T t;
//    public NormalHandler(T t){
//        this.t = t;
//    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用开始");
        if("getAge".equals(method.getName())){
            System.out.println("这里是getAge方法"+String.valueOf(args[0]));
//            return method.invoke(t,args);
        }
        if("getNumber".equals(method.getName())){
            System.out.println("这里是getNumber方法"+String.valueOf(args[0]));
//            return method.invoke(t,args);
        }
        System.out.println("调用结束");
        return null;
    }

    public static  <T>T getNewProxy(Class<T> t){
        ClassLoader load = t.getClassLoader();
        Class<?>[] interfaces =new Class<?>[]{t};
        NormalHandler a = new NormalHandler();
        return (T) Proxy.newProxyInstance(load, interfaces, a);
    }

}
