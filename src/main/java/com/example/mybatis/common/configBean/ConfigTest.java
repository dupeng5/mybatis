package com.example.mybatis.common.configBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTest {
    @Bean
    public BeanTest getBeanTest(){
        BeanTest beanTest = new BeanTest();
        beanTest.setAge("16");
        beanTest.setName("zhangsan");
        return beanTest;
    }
}
