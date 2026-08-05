package net.chat_system.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ReceiveThread extends Thread {
    private Socket socket;
    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            DataInputStream dis = Client.disMap.get(socket);
            while (true) {
                int type = dis.readInt();
                if(type == 1){
                    System.out.println("当前好友列表：");
                    int friendNum = dis.readInt();
                    for(int i = 1;i <=friendNum;i++){
                        String friend = dis.readUTF();
                        System.out.println(i + "." + friend);
                    }
                }
                else if(type == 2){
                    String msg = dis.readUTF();
                    System.out.println(msg);
                }
                else if(type == 3){
                    String privateMsg = dis.readUTF();
                    System.out.println("私聊消息：" + privateMsg);
                }
                else{
                    System.out.println("输入错误，请重新输入！");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
