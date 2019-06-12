package com.example.mybatis.util;

import javax.annotation.processing.FilerException;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * @Author: dupeng5
 * @Date: 2019/6/10 14:57
 * @Version 1.0
 */

public class DiffOrCacu {
/*
      异或运算
* */
    public static void diffor(){
        //异或运算
        int[] a = new int[]{9,0};
        int result = a[0];
        for(int i = 1 ; i<a.length;i++){
            result = result ^ a[i];
            System.out.println(result);
        }
        System.out.println("last result:   "+result);
    }

    /**
     * 跳出循环
     */
    public static void breakMark(){
        //异或运算
        label:
        for(int i=0;i<10;i++){
          for(int j=0;j<10;j++){
               for(int m=0;m<10;m++) {
                   for(int n=0;n<10;n++) {
                       System.out.println(""+i+j+m+n);
                        if(n==6){
                            continue label;
                        }
                   }
               }
           }
       }

        System.out.println("jiesu");
    }

    /**
     * try catch
     */
    public static void tryc(){
        try {
            System.out.println("try");
            throw new SQLException();
        }catch (SQLException c){
            System.out.println("catch SQLException");
            return;
        }catch (Exception e){
            System.out.println("catch Exception");

        }finally {
            System.out.println("finally");
        }
        System.out.println("end");
    }

    /**
     * switch  不支持long
     */
    public static void swirch(){
//        long a = 2;
//        switch(a){
//            case 1:
//                System.out.println("1");break;
//            case 2:
//                System.out.println("2");break;
//        }
    }

        public static void main(String[] args) {
        //异或运算
//        diffor();
        //break标记
//        breakMark();
        //异常抛出
//        tryc();
          swirch();
    }
}
