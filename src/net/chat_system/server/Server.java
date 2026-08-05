package net.chat_system.server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    public static Map<Socket,String> onlineSocket = new ConcurrentHashMap<>();
    public static Map<Socket, DataOutputStream> dosMap = new ConcurrentHashMap<>();
    public static void main(String[] args) {
        System.out.println("服务端启动成功");
        //创建ServerSocket对象
        try {
            //创建ServerSocket对象,注册端口
            ServerSocket ss = new ServerSocket(Contanst.PORT);

            while (true) {
                Socket s = ss.accept();
                //接收管道创建线程处理
                ServerThread st = new ServerThread(s);
                st.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
