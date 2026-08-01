package thread.executorservice;

import java.util.concurrent.*;

//学习创建线程池
public class Demo1 {
    public static void main(String[] args){
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,5,3, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        //1.线性池运行Runnable任务 用execute
        Runnable target = new MyRunnable();
        pool.execute(target);//execute用来执行Runnable任务
        pool.execute(target);
        pool.execute(target);
        //当所有线程都在工作且等候区满时，报错
//        pool.execute(target);
//        pool.execute(target);
//        pool.execute(target);
//        pool.execute(target);
//        pool.execute(target);
//        pool.execute(target);



        //2.线程池运行Callable,用submit
        Callable<String> c = new MyCallable();
        //Callable使用流程
        /*FutureTask<String> f = new FutureTask<>(c);
        Thread t = new Thread(f);*/
        Future<String> f1 = pool.submit(c);
        Future<String> f2 = pool.submit(c);
        try{
            System.out.println(f1.get());
            System.out.println(f2.get());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) System.out.println(Thread.currentThread().getName() + "线程:" + i);
        try {
            Thread.sleep(1000);  // 让每个任务执行 5 秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable{
    @Override
    public String call(){
        return "hahaha";
    }
}