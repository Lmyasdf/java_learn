package thread.redpackage;

import java.util.List;
import java.util.Random;

public class RedPackageThread extends Thread{
    private List<Double> list;
    public RedPackageThread(String s , List<Double>list){
        super(s);
        this.list = list;
    }

    @Override
    public void run(){
        //while循环是保证每个员工都在不停地抢
        while (true) {
            //锁list集合，保证list只会被一个线程操作
            synchronized(list) {
                if(list.size()==0)break;//关键保护、及时结束，防止红包没了后仍然有线程进锁继续抢红包
                int index = new Random().nextInt(list.size());
                System.out.println(Thread.currentThread().getName() + "抢到" + list.get(index) + "元");
                list.remove(index);
                if(list.size()==0){
                    System.out.println("活动结束");
                    break;
                }
            }

            //抢红包冷却时间
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
