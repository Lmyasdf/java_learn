package thread.threadbasics;

public class Createdemo1 {
    //main方法本身是由一条主线程负责执行的
    public static void main(String[] args){
        Thread t1 = new Mythread();
        t1.start();//启动线程必须start，而不是直接调用run
        for(int i=1;i<=5;i++) System.out.println("主线程执行" + i);
    }

}
//定义一个子类继承Thread,成为一个线程类
class Mythread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++) System.out.println("子线程执行" + i);
    }
}