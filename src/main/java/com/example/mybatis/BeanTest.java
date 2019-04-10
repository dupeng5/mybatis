package com.example.mybatis;

import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class BeanTest {

    public static void main(String[] args){
        try{
           BeanTest beanTest = new BeanTest();
           new Thread(beanTest.new Runtest()).start();
        }catch(Exception e){
        }
    }

    public class Runtest implements Runnable {
        private String url="http://localhost:8080/aiga3/sys/organize/findAllOrg";

        @Override
        public void run() {
            while(true){
                try {
                    RestTemplate restTemplate = new RestTemplate();
                    String a = restTemplate.postForObject(url,null,String.class);
                    System.out.printf(Thread.currentThread().getName());
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
