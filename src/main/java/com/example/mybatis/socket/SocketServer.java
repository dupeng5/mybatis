package com.example.mybatis.socket;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * @Author: dupeng5
 * @Date: 2019/5/23 9:24
 * @Version 1.0
 */
public class SocketServer {
    public static void main(String[] args) throws Exception {
        int port = 5009;
        ServerSocket server = new ServerSocket(port);

        //等待连接
        System.out.println("等待连接");
        Socket socket = server.accept();
        InputStream input = socket.getInputStream();
        byte[] bytes;

        while(true){
            int first = input.read();
            System.out.println(first);
            if(first == -1){
                break;
            }
            int second = input.read();
            System.out.println(second);

            //获取文件内容
            bytes = new byte[first+second];
            input.read(bytes);
            System.out.println("get message from client: " + new String(bytes, "UTF-8"));
        }
        input.close();
        socket.close();
        server.close();
    }
}
