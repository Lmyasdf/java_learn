package io;

import java.io.FileInputStream;
import java.io.InputStream;

//字节输入流
public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("src\\io\\dlei01.txt");
        byte[] b = new byte[3];//水桶
        int len;//实际读取的字节数
        while((len = is.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }
    }
}
