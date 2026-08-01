package thread.threadbasics;

//第二种创建方式，实现Runnable接口
public class CreateDemo2 {
    public static void main(String[] args) {
        Runnable r = new Runnable(){
            @Override
            public void run(){
                for(int i=1;i<=5;i++){
                    System.out.println("子线程"+i);
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
        for(int i=1;i<=5;i++) System.out.println("主线程"+i);
    }
}

