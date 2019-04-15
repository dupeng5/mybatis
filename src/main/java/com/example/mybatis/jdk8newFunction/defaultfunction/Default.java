package com.example.mybatis.jdk8newFunction.defaultfunction;

/**
 * @Author: dupeng5
 * @Date: 2019/4/15 14:49
 * @Version 1.0
 */
public class Default {

    public interface  MyInterfaceA {
        default void getMessage(){
            System.out.println("MyinterfaceA   get Message()");
        }
        void getAge();
    }
    public interface  MyInterfaceB {
        default void getMessage(){
            System.out.println("MyinterfaceB   get Message()");
        }
        void getAge();
    }

    public class PrintClass{
        public void getMessage(){
            System.out.println("PrintClass   get Message()");
        }
    }

    public class InterfaceImpl implements MyInterfaceA{
        @Override
        public void getAge() {
            System.out.println("get Age()");
        }
    }
    public class InterfaceImplfull implements MyInterfaceA , MyInterfaceB{
//        包含两个相同默认方法需重写或者指定一个
        @Override
        public void getMessage() {
            MyInterfaceA.super.getMessage();
        }
        @Override
        public void getAge() {
            System.out.println("get Age()");
        }
    }

    public class InterfaceImplext extends PrintClass implements MyInterfaceA , MyInterfaceB{
        //        包含两个相同默认方法需重写或者指定一个
        @Override
        public void getAge() {
            System.out.println("get Age()");
        }
    }

    public static void main(String[] args) {
        Default a = new Default();
        //接口默认方法实现
        System.out.println("接口默认方法实现");
        InterfaceImpl b =  a.new InterfaceImpl();
        b.getMessage();
        b.getAge();
        //实现两个包含相同默认方法的接口类
        System.out.println("继承两个包含相同默认方法的接口类(此处指定A)");
        InterfaceImplfull full =  a.new InterfaceImplfull();
        full.getMessage();
        //若同时实现和继承相同方法，默认采用继承父类的
        System.out.println("若同时实现和继承相同方法");
        InterfaceImplext ext =  a.new InterfaceImplext();
        ext.getMessage();
    }
}
