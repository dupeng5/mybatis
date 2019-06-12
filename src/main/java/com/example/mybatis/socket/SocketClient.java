package com.example.mybatis.socket;


import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author: dupeng5
 * @Date: 2019/5/23 9:23
 * @Version 1.0
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        String ip = "127.0.0.1";
        int port = 5009;
        Socket socket = new Socket(ip, port);
        OutputStream outputStream = socket.getOutputStream();
        int i =5;
        while(i-->0){
            String str = "hello world"+i;
            byte[] bytes = str.getBytes("UTF-8");
            int a =280;
            System.out.println(a>>8);
            outputStream.write(a);
            outputStream.write(a);
            outputStream.write(bytes);
        }
        outputStream.close();
        socket.close();

    }
}
