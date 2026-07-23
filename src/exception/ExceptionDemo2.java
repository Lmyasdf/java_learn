package exception;
//异常的作用：作为一种特殊的返回值，通知调用者发生了异常，需要进行处理
public class ExceptionDemo2 {
    public static void main(String[] args){
        System.out.println("程序开始执行");
        try{
            System.out.println(div(10,0));
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("程序结束执行");
    }
    public static int div(int a,int b) throws RuntimeException{
        if(b == 0){
            System.out.println("除数不能为0");
            //没法正常返回，可以抛出异常
            throw new RuntimeException("除数不能为0");
        }
        return a/b;
    }
}
