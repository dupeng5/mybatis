package com.example.mybatis.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Author: dupeng5
 * @Date: 2019/6/27 17:48
 * @Version 1.0
 */
public class TestGeneric {
    public static void main(String[] args) {
        List<? extends Hero> list1 = new ArrayList<>();
        List<? super Hero> list2 = new ArrayList<>();
        Hero a = list1.get(0);
        list2.add(new ApHero());
        Object s = list2.get(0);
        list2.forEach((e)->{
            System.out.println("有值");
        });
        Optional.empty();
    }
}
