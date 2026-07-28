package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//字节输入输出流
public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //字节输入流：读取文件
        InputStream is = new FileInputStream("src\\io\\dlei01.txt");
        byte[] b = new byte[3];//水桶
        int len;//实际读取的字节数
        while((len = is.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }
        is.close();

        //字节输出流：写入文件
        OutputStream os = new FileOutputStream("src\\io\\dlei02.txt",true);
        os.write(97);
        os.write("\r\n".getBytes());
        byte[] b2 = "我爱你中国666".getBytes();
        os.write(b2);
        os.write(b2,0,3);//我
        os.close();
    }
}
