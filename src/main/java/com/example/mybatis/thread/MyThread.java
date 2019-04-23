package com.example.mybatis.thread;

/**
 * @Author: dupeng5
 * @Date: 2019/4/19 11:41
 * @Version 1.0
 * 优点：实现简单，只需实例化继承类的实例，即可使用线程
 * 缺点：扩展性不足，Java是单继承的语言，如果一个类已经继承了其他类，就无法通过这种方式实现自定义线程
 */
public class MyThread extends Thread {

    private static int num=1;
    private int selfNum=0;
    public MyThread(){
        this.selfNum =num++;
    }
    @Override
    public void run() {
//        Thread.currentThread().setName("selfNum:"+selfNum);
        System.out.println(String.valueOf(Thread.currentThread().getName())+"主动创建的第"+selfNum+"个线程");

    }
}