package com.example.mybatis;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static java.lang.Thread.sleep;

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

        try {
            while(true){
                stringRedisTemplate.opsForValue().append("code","数据"+String.valueOf(System.currentTimeMillis()));
                stringRedisTemplate.opsForValue().set(String.valueOf(System.currentTimeMillis()),String.valueOf(System.currentTimeMillis()));
                Thread.sleep(100);
            }
        } catch (Exception e){

        }finally {

        }
//        System.out.println(stringRedisTemplate.opsForValue().get("code"));
    }
}
