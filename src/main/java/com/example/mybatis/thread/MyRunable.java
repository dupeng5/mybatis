package com.example.mybatis.thread;

/**
 * @Author: dupeng5
 * @Date: 2019/4/19 14:58
 * @Version 1.0
 */
public class MyRunable implements Runnable  {
    @Override
    public void run() {
        System.out.println("多线程Runable实现");
    }
}
