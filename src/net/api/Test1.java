package net.api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    static void main(String[] args) {
        //掌握java提供的获取时间方案
        Date d = new Date();
        System.out.println(d);
        //格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));

    }
}
