package com.example.mybatis.common.configBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigTest.class);
        //获取bean
        BeanTest tb = (BeanTest)context.getBean(BeanTest.class);
        System.out.println(tb.getName());
    }
}
