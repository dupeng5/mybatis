package com.example.mybatis.util;

import org.springframework.web.client.RestTemplate;


public class BeanTest {

    public static void main(String[] args){
        String a = "a"+"b";
        String b = "ab";
        System.out.println(a==b);
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
