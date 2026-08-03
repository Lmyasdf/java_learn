package net.TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerThread extends Thread{
    private Socket s;
    @Override
    public void run(){
        try {
            //3.从管道中得到字节输入流
            InputStream is = s.getInputStream();

            //4.读取客户端发送的数据(特殊数据输入流，因为客户端是特殊数据输出)
            DataInputStream dis = new DataInputStream(is);

            while (true) {
                //5.读取数据
                String str = dis.readUTF();
                System.out.println(str);
                System.out.println("客户端IP：" + s.getInetAddress().getHostAddress());
                System.out.println("客户端端口：" + s.getPort());

                System.out.println("------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
            //捕捉客户端下线
            System.out.println("客户端下线");
        }

    }
    public ServerThread(Socket s){
        this.s = s;
    }
}
