package com.example.mybatis.jdk8newFunction.lambda;

/**
 * @Author: dupeng5
 * @Date: 2019/4/16 11:02
 * 构造和引用
 * @Version 1.0
 */
public class ConstructRef {
    public class Person {
        private String name;
        private String age;
        Person() {
            System.out.println("默认构造");
        }
        public Person (String name ,String age){
            this.name = name ;
            this.age = age;
            System.out.println("带参数构造");
        }
    }
    public interface Factory<P> {
         public  P create();
    }
    public Person test(){
        Factory<Person> a = Person::new;
        return a.create();

    }
    public static void main(String[] args) {
        ConstructRef constructRef = new ConstructRef();
        Person a = constructRef.test();
    }
}
