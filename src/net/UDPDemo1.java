package net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPDemo1 {
    public static void main(String[] args) throws Exception {
        //目标：认识UDP协议
        //1.创建UDP协议的发送端
        DatagramSocket socket = new DatagramSocket();

        //2.创建发送端的字节数组
        byte[] bytes = "hello".getBytes();

        //3.创建发送端的DatagramPacket对象
        // (发送端的字节数组,发送端的字节数组的长度,发送端的IP地址,发送端的端口号)
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length,InetAddress.getLocalHost(),8080);

        //4.发送
        socket.send(packet);
        System.out.println("发送成功");
    }
}
