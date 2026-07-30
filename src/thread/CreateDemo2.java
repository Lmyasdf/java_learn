package thread;

//第二种创建方式，实现Runnable接口
public class CreateDemo2 {
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
        for(int i=1;i<=5;i++) System.out.println("主线程"+i);
    }
}
class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("子线程"+i);
        }
    }
}
