package com.example.mybatis.thread;

import java.util.concurrent.FutureTask;

/**
 * @Author: dupeng5
 * @Date: 2019/4/19 11:46
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args)throws InterruptedException{
        //Thread

            Thread a = new MyThread();
            Thread b = new MyThread();
            Thread c = new MyThread();
            a.start();
            a.interrupt();
            a.join();
            b.start();
            b.join();
            c.start();

        //Runable
//        MyRunable myRunable = new MyRunable();
//        Thread thread = new Thread(myRunable);
//        thread.start();
//        //Callable
//        MyCallable myCallable = new MyCallable();
//        FutureTask<String> futureTask = new FutureTask<>(myCallable);
//        Thread callthread = new Thread(futureTask);
//        callthread.start();

    }
}
