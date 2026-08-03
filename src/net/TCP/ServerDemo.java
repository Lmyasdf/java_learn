package net.TCP;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //1.创建服务端ServerSocket
        ServerSocket ss = new ServerSocket(8888);

        //2.阻塞式等待客户端连接
        Socket socket = ss.accept();

        //3.从管道中得到字节输入流
        InputStream is = socket.getInputStream();

        //4.读取客户端发送的数据(特殊数据输入流，因为客户端是特殊数据输出)
        DataInputStream dis = new DataInputStream(is);

        //5.读取数据
        int i = dis.readInt();
        String str = dis.readUTF();
        System.out.println(i);
        System.out.println(str);
        System.out.println("客户端IP：" + socket.getInetAddress().getHostAddress());
        System.out.println("客户端端口：" + socket.getPort());

        //6.关闭资源
        dis.close();
        is.close();
        socket.close();
        ss.close();
    }
}
