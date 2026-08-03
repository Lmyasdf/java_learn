package net.TCP;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPDemo1 {
    public static void main(String[] args) throws Exception {
        //1.创建Socket管道对象
        Socket socket = new Socket("127.0.0.1",8888);

        //2.从管道中得到字节输出流
        OutputStream os = socket.getOutputStream();

        //3.使用特殊数据流
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeInt(1);
        dos.writeUTF("hello world");
        System.out.println("客户端发送数据完成");

        //4.关闭资源
        dos.close();
        os.close();
        socket.close();
    }
}
