package com.example.mybatis.jdk8newFunction.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @Author: dupeng5
 * @Date: 2019/4/16 9:25
 * 函数式接口
 * @Version 1.0
 */
public class FunctionalInterface {
    @java.lang.FunctionalInterface
    public interface MyInterface{
        void run(String a);
    }
    public void functionTest(){
//      函数式接口测试
        MyInterface a = (str)-> System.out.println("这里是run方法"+str);
        a.run("function  chaungcvan");
//        高阶函数  函数到函数的映射
        Function <Integer,Function<Integer,Integer>> addrFuntion = x-> y->x+y;
        int x =2;
        Function<Integer,Integer> add1 = addrFuntion.apply(2);
        System.out.println(add1.apply(x));
//        高阶函数  二元函数
        BiFunction<Integer,Integer,Integer>  bifuntion = (m,n)->m*n;
        System.out.println(bifuntion.apply(8,9));
        //        其他函数参考api  eg:
        // BiFunction ：R apply(T t, U u);接受两个参数，返回一个值，代表一个二元函数；

        //DoubleFunction ：R apply(double value);只处理double类型的一元函数；

        //IntFunction ：R apply(int value);只处理int参数的一元函数；

        //LongFunction ：R apply(long value);只处理long参数的一元函数；

        //ToDoubleFunction：double applyAsDouble(T value);返回double的一元函数；

        //ToDoubleBiFunction：double applyAsDouble(T t, U u);返回double的二元函数；
    }
    //
    public static void main(String[] args) {



    }
}
