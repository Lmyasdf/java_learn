package net.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：认识UDP协议
        //1.创建UDP协议的发送端
        DatagramSocket socket = new DatagramSocket();

        //2.创建发送端的字节数组
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的内容：");
            String data = sc.nextLine();
            if(data.equals("exit")){
                System.out.println("客户端退出");
                socket.close();
                break;
            }
            byte[] bytes = data.getBytes();

            //3.创建发送端的DatagramPacket对象
            // (发送端的字节数组,发送端的字节数组的长度,发送端的IP地址,发送端的端口号)
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length,InetAddress.getLocalHost(),8080);

            //4.发送
            socket.send(packet);
            System.out.println("发送成功");
        }
    }
}
