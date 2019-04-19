package com.example.mybatis.thread;

import java.util.concurrent.Callable;

/**
 * @Author: dupeng5
 * @Date: 2019/4/19 15:09
 * @Version 1.0
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        String output = "this is my Callable";
        System.out.println(output);
        return output;
    }
}
