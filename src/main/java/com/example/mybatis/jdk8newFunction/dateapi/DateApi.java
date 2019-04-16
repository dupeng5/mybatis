package com.example.mybatis.jdk8newFunction.dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: dupeng5
 * @Date: 2019/4/16 11:28
 * @Version 1.0
 */
public class DateApi {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(dtf.format(dt));
    }
}
