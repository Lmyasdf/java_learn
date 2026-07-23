package exception;

import java.util.Scanner;
//自定义运行时异常
public class ExceptionDemo3 {
    public static void main(String[] args){
        //输入年龄
        System.out.println("程序开始执行,请输入年龄：");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        //检查年龄是否合法
        try{
            System.out.println("年龄为：" + check(age));
        }catch(MyRuntimeException e){
            e.printStackTrace();
            System.out.println("年龄非法");
        }
        System.out.println("程序结束执行");
    }

    public static int check(int age){
        if(age>200){
            throw new MyRuntimeException("年龄不能大于200");
            //如果是编译时异常记得方法后要throws
        }
        return age;
    }
}
