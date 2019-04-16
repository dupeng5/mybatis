package com.example.mybatis.jdk8newFunction.lambda;

import java.util.*;

/**
 * @Author: dupeng5
 * @Date: 2019/4/15 17:25
 * @Version 1.0
 */
public class LambdaSort {
    public class MyConparetor implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            if(o1.getAge()>o2.getAge()){
                return -1;
            } else if (o1.getAge()<o2.getAge()){
                return 1;
            } else {
                return 0;
            }
        }
    }
    public class Person {
        private String name;
        private int age;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        LambdaSort ful = new LambdaSort();
        List<Person> pl = new ArrayList<Person>();
        int i = 10;
        while(i-->0){
           Person a = ful.new Person();
           a.setAge((int)(Math.random()*100+1));
           pl.add(a);
        }
        //老式排序方法
//        MyConparetor myConparetor = ful.new MyConparetor();
//        Collections.sort(pl,myConparetor);
//
        //lambda式代码
        Collections.sort(pl,(Person o1,Person o2)->(Integer.compare(o1.getAge(),o2.getAge())));
        pl.forEach(e -> System.out.println(e.getAge()));
    }
}
