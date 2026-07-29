package io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

//数据输出流DataOutputStream
public class DataStreamDemo {
    public static void main(String[] args) {
        try(
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("src\\io\\dlei03.txt",true));
                ){
            dos.write('\n');
            dos.writeByte(97);
            dos.writeBoolean(true);
            dos.writeInt(100);
            dos.writeUTF("中国");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
