package net.chat_system.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Map;

public class ServerThread extends Thread {
    private Socket socket;
    public ServerThread(Socket s) {
        this.socket = s;
    }
    @Override
    public void run(){
        //服务端可能接收的消息：
        //1.登录
        //2.群聊
        //3.私聊
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            while(true){
                int type = dis.readInt();
                switch(type){
                    case 1:
                        //登录
                        String username = dis.readUTF();
                        System.out.println("客户端登录了:" + username);
                        Server.onlineSocket.put(socket,username);
                        //初始化每个用户的数据输出流,并添加到Map中
                        Server.dosMap.put(socket,new DataOutputStream(socket.getOutputStream()));
                        updateClientOnlineUserList();
                        break;
                    case 2:
                        //群聊
                        String msg = dis.readUTF();
                        System.out.println("客户端发送了群聊消息:" + msg);
                        sendMsgToAll(msg);
                        break;
                    case 3:
                        //私聊
                        String target = dis.readUTF();
                        String privateMsg = dis.readUTF();
                        //1.判断目标用户是否存在
                        if(!Server.onlineSocket.containsValue(target)){
                            System.out.println("目标用户不存在");
                            continue;
                        }
                        //2.发送私聊消息给目标用户
                        sendMsgToUser(target,privateMsg);
                        break;
                    default:
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("客户端下线了:" + socket.getInetAddress().getHostAddress());
            Server.onlineSocket.remove(socket);
            Server.dosMap.remove(socket);
            updateClientOnlineUserList();
        }

    }


    private void updateClientOnlineUserList(){
        //更新客户端在线用户列表
        //1.获取所有在线用户
        Collection<String> s = Server.onlineSocket.values();
        try {
            //2.遍历所有在线用户,发送在线用户列表
            for(Socket user : Server.onlineSocket.keySet()){
                //3.创建数据输出流,发送消息类型
                DataOutputStream dos = Server.dosMap.get(user);
                dos.writeInt(1);
                dos.writeInt(s.size());
                //4.遍历所有在线用户昵称,发送在线用户列表
                for(String str : s){
                    dos.writeUTF(str);
                }
                //5.刷新数据输出流，因为数据输出流是缓冲区，需要刷新才能发送
                dos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMsgToAll(String msg){
        //发送消息给所有在线用户
        Collection<Socket> s = Server.onlineSocket.keySet();
        try{
            //1.处理信息(时间+用户名+消息内容)
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss EEE a");

            StringBuilder sb = new StringBuilder();
            sb.append(dtf.format(now));
            sb.append("\r\n");
            sb.append(Server.onlineSocket.get(socket));
            sb.append(":");
            sb.append(msg);

            //2.发送消息给所有在线用户
            for(Socket socket : s) {
                DataOutputStream dos = Server.dosMap.get(socket);
                dos.writeInt(2);
                dos.writeUTF(sb.toString());
                dos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMsgToUser(String target, String privateMsg) {
        //通过target找到目标用户的socket对象
        Socket targetSocket = null;
        for(Map.Entry<Socket,String> entry : Server.onlineSocket.entrySet()){
            if(entry.getValue().equals(target)){
                targetSocket = entry.getKey();
                break;
            }
        }
        if(targetSocket == null){
            System.out.println("目标用户不存在");
            return;
        }
        //发送私聊消息给目标用户
        try {
            DataOutputStream dos = Server.dosMap.get(targetSocket);
            //1.处理信息(时间+用户名+消息内容)
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss EEE a");

            StringBuilder sb = new StringBuilder();
            sb.append(dtf.format(now));
            sb.append("\r\n");
            sb.append(Server.onlineSocket.get(socket));
            sb.append(":");
            sb.append(privateMsg);

            //2.发送消息给目标用户
            dos.writeInt(3);
            dos.writeUTF(sb.toString());
            dos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
