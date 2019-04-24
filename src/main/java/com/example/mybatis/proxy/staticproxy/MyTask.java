package com.example.mybatis.proxy.staticproxy;

/**
 * @Author: dupeng5
 * @Date: 2019/4/24 9:39
 * @Version 1.0
 */
public class MyTask  implements MyInterface {
    @Override
    public String run() {
        System.out.println("这里是run方法");
        return "这里是run方法";
    }

    public static void main(String[] args) {
        MyTask a = new MyTask();
        a.doTask();
    }
}
