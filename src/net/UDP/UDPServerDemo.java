package net.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //1.创建服务端对象
        DatagramSocket socket = new DatagramSocket(8080);

        //2.创建数据包对象接收
        byte[] b = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(b,b.length);

        //3.接收
        while (true) {
            socket.receive(packet);

            int len = packet.getLength();
            String data = new String(b,0,len);
            System.out.println(data);
            System.out.println("发送端IP：" + packet.getAddress().getHostAddress());
            System.out.println("发送端端口：" +packet.getPort());
            System.out.println("----------------");

        }

    }
}
