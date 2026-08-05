package net.chat_system.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {
    private Socket socket;
    private String userName;
    public SendThread(Socket socket , String userName) {
        this.userName = userName;
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            DataOutputStream dos = Client.dosMap.get(socket);
            Scanner sc = new Scanner(System.in);
            while (true) {

                System.out.println("请选择：1.发送消息给所有在线用户 2.发送消息给指定用户");
                System.out.println("请输入您的选择：");
                int i = sc.nextInt();
                sc.nextLine();

                //2.群聊
                if(i == 1){
                    dos.writeInt(2);
                    System.out.println("请输入要发送的消息：");
                    String msg = sc.nextLine();
                    dos.writeUTF(msg);
                    dos.flush();
                    System.out.println("发送成功");
                }

                //3.私聊
                else if(i == 2){
                    dos.writeInt(3);
                    System.out.println("请输入私聊目标用户昵称：");
                    String target = sc.nextLine();
                    System.out.println("请输入私聊消息：");
                    String privateMsg = sc.nextLine();
                    dos.writeUTF(target);
                    dos.writeUTF(privateMsg);
                    dos.flush();
                    System.out.println("发送成功");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
