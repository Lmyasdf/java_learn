package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//认识异常
public class ExceptionDemo1 {
    public static void main(String[] args) {
        show();

        //异常处理2 ：Alt+enter选第二个 trycatch
        try {
            show2();
        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.out.println("日期格式错误");
            e.printStackTrace();//打印异常信息
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        }
    }

    //运行时异常，继承自RuntimeException
    public static void show(){
        int[] arr = {1,2,3};
        //System.out.println(arr[3]);

        //System.out.println(10/0);

        String str = null;
        System.out.println(str);
        //空指针异常NullPointerException
        //System.out.println(str.length());
    }

    //编译时异常，继承自Exception
    //多个异常时可以直接抛Exception类表示所有异常，catch时（Exception e）可以捕获所有异常
    public static void show2() throws ParseException, FileNotFoundException {
        System.out.println("程序开始。。。。。");
        String str = "2026-01-01 12/00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //异常处理1: Alt+enter 快捷throws
        System.out.println(sdf.parse(str));

        InputStream is = new FileInputStream("D:/Code/javamax");

        System.out.println("程序结束。。。。。");
    }


}


