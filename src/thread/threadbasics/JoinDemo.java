package thread.threadbasics;
//join方法：等待调用它的线程执行完毕，再继续执行其他线程
//线程插队
public class JoinDemo {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("子线程1");
        t1.start();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + "线程输出：" + i);
            if(i==1){
                try{
                    t1.join();//等待子线程1执行完毕
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + "子线程输出：" + i);
        }
    }

    public MyThread2(String name){
        super(name);
    }

    public MyThread2(){}
}
