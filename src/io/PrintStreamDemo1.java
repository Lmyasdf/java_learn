package io;

import java.io.PrintStream;

//打印流
//PrintWriter与PrintStream功能相同
public class PrintStreamDemo1 {
    public static void main(String[] args) {
        try(
                PrintStream ps = new PrintStream("src\\io\\dlei03.txt")
                //若要实现保留原文件内容，那就传入低级流给PrintStream
                /*
                OutputStream os = new FileOutputStream("src\\io\\dlei03.txt",true);
                PrintStream ps = new PrintStream(os);
                */
        ){
            ps.print(97);
            ps.println(true);
            ps.print("中国");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
