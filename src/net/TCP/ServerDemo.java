package net.TCP;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        //1.创建服务端ServerSocket
        ServerSocket ss = new ServerSocket(8888);

        while(true){
            //2.阻塞式等待客户端连接
            Socket socket = ss.accept();
            System.out.println("一个客户端上线了：" + socket.getInetAddress().getHostAddress());
            //把客户端管道单独交给一个线程来处理
            ServerThread st = new ServerThread(socket);
            st.start();
        }

    }
}
