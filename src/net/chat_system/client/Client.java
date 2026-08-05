package net.chat_system.client;

import net.chat_system.server.Contanst;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Client {
    public static Map<Socket, DataOutputStream> dosMap = new ConcurrentHashMap<>();
    public static Map<Socket, DataInputStream> disMap = new ConcurrentHashMap<>();
    public static void main(String[] args) {
        //创建管道连接服务端
        try{
            Socket socket = new Socket(Contanst.IP, Contanst.PORT);
            dosMap.put(socket, new DataOutputStream(socket.getOutputStream()));
            disMap.put(socket, new DataInputStream(socket.getInputStream()));
            //1.登录
            System.out.println("请输入用户名");
            Scanner sc = new Scanner(System.in);
            String userName = sc.nextLine();
            DataOutputStream dos = dosMap.get(socket);
            dos.writeInt(1);
            dos.writeUTF(userName);
            dos.flush();
            System.out.println("登录成功");

            //发送消息
            new SendThread(socket, userName).start();

            //接收消息
            new ReceiveThread(socket).start();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
