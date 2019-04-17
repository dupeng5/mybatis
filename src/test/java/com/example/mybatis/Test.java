package com.example.mybatis;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: dupeng5
 * @Date: 2019/4/17 18:13
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("andev")
@SpringBootTest
public class Test {
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @org.junit.Test
    public void test(){
        stringRedisTemplate.opsForValue().set("code","123456");
        System.out.println(stringRedisTemplate.opsForValue().get("code"));
    }
}
