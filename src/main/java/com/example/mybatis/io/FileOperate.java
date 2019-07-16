package com.example.mybatis.io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: dupeng5
 * @Date: 2019/6/25 14:14
 * @Version 1.0
 */
public class FileOperate {
    //文件读写
    public void wr() {
        FileOutputStream opsm = null;
        try {
            String path = "d:"+File.separator+"addd"+File.separator;
            File dir = new File(path);
            if(!dir.isDirectory()){
                dir.mkdirs();
            }
            String fileName = "test.txt";
            File file = new File(dir,fileName);
            if(!file.exists()){
                file.createNewFile();
            }
            opsm = new FileOutputStream(file);
            String a = "hellow";
            opsm.write(a.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != opsm){
                try {
                    opsm.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //中文读写
    public static void main(String[] args)  {
        try {
            String path = "d:"+File.separator+"addd"+File.separator;
            File dir = new File(path);
            if(!dir.isDirectory()){
                dir.mkdirs();
            }
            String fileName = "test.txt";
            File file = new File(dir,fileName);
            if(!file.exists()){
                file.createNewFile();
            }
            FileInputStream a = new FileInputStream(file);
            byte[] temp = new byte[a.available()];
            a.read(temp);
            System.out.println(new String(temp,0, temp.length));
            a.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}