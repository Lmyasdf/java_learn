package thread.threadbasics;

public class ApiDemo {
    public static void main(String[] args) {
        Thread t1 = new MyThread("子线程1");
        //t1.setName("子线程1");//设置名字放在start方法之前
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new MyThread();
        t2.setName("子线程2");
        t2.start();
        System.out.println(t2.getName());



        System.out.println(t1.getName());
        System.out.println(t2.getName());

        Thread m = Thread.currentThread(); //谁调用就拿到哪个线程
        m.setName("主线程");
        System.out.println(m.getName());

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + "子线程输出：" + i);
        }
    }

    public MyThread(String name){
        super(name);
    }

    public MyThread(){}
}