package net.api;

import java.math.BigDecimal;

public class DoubleApi {
    //解决浮点型运算精度问题
    //学习BigDecimal类
    static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        System.out.println(a+b);
        //创建BigDecimal对象 (把小数包装成对象来操作)
        BigDecimal bd = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        //进行加法运算
        BigDecimal sum = bd.add(bd2);
        System.out.println(sum);

        //优化方案，直接调用valueOf方法创建BigDecimal对象
        BigDecimal bd3 = BigDecimal.valueOf(a);
        BigDecimal bd4 = BigDecimal.valueOf(b);
        BigDecimal sum1 = bd3.add(bd4);
        double result = sum1.doubleValue();
        System.out.println(result);
    }
}
