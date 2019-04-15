package com.example.mybatis.proxy.dynamicproxy.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object sub, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before Method Invoke");
        Object object= methodProxy.invokeSuper(sub, objects);
        System.out.println("After Method Invoke");
        return object;
    }
}
