package net.TCP;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//增加多客户端功能
public class TCPDemo1 {
    public static void main(String[] args) throws Exception {
        //1.创建Socket管道对象
        Socket socket = new Socket("127.0.0.1",8888);

        //2.从管道中得到字节输出流
        OutputStream os = socket.getOutputStream();

        //3.使用特殊数据流
        DataOutputStream dos = new DataOutputStream(os);
        while (true) {
            dos = new DataOutputStream(os);
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要发送的内容：");

            String s = sc.nextLine();
            dos.writeUTF(s);
            if(s.equals("exit")){
                System.out.println("客户端退出");
                dos.close();
                socket.close();
                break;
            }
            System.out.println("客户端发送数据完成");
        }

    }
}
