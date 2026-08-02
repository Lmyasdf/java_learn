package net;

import java.net.InetAddress;

public class InetAddressDemo1 {
    public static void main(String[] args){
        //目标：认识InetAddress获取本机IP对象和对方IP对象
        try{
            //获取本机IP对象
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            System.out.println(localHost.getHostName());
            System.out.println(localHost.getHostAddress());//字符串;
            //获取对方IP对象
            InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress);

            //判断本机与对方主机是否接通
            System.out.println(inetAddress.isReachable(5000));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
