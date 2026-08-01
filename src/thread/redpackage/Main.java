package thread.redpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        //创建集合来存储200个红包
        List<Double> redPackage = getRedPackage();
        //创建100个线程去start抢红包
        for(int i=1;i<=100;i++){
            Thread t = new RedPackageThread(i + "号员工",redPackage);
            t.start();
        }

    }

    //创建200个规定金额红包
    public static List<Double> getRedPackage(){
        List<Double> l = new ArrayList<>();
        Random r = new Random();
        for(int i=1;i<=160;i++){
            l.add(getMoney(r.nextDouble() * 29 + 1));
        }
        for(int i=1;i<=40;i++){
            l.add(getMoney(r.nextDouble() * 69 + 31));
        }
        return l;
    }

    //确定红包金额数的小数位数
    public static double getMoney(double d){
        return Math.round(d * 100)/100.0;
    }
}


