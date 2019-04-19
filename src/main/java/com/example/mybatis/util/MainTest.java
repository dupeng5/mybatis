package com.example.mybatis.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: dupeng5
 * @Date: 2019/4/19 17:59
 * @Version 1.0
 */
public class MainTest {
    public static void main(String[] args) {
        int i=100;
        int m=i,n=0;
        HashMap<String,Integer> map = new HashMap();
        List a = new ArrayList<>();
        while(i-->0){
            a.add((int)(Math.random()*10)+1);
        }
        System.out.println(a.size());
        while(n++<m-1){
            String str = a.get(n-1)+","+a.get(n);
            Integer value = map.get(str);
            if(value!=null){
                map.put(str,++value);
            } else {
                map.put(str,0);
            }
        }
        map.forEach((c,d)->{
            System.out.println("key:"+c+"     value:"+d);
        });

        System.out.println(map.size());
    }

}
