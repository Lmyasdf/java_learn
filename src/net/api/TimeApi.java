package net.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimeApi {
    static void main(String[] args) {
        //掌握java提供的获取时间方案(Date,已淘汰)
        Date d = new Date();
        System.out.println(d);
        //格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));


        //新方法
        //LocalDate LocalTime LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getDayOfYear());

        //格式化
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(now));
    }
}
