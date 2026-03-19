package chapter20.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args){
        // 这个时间是什么时间
        // 1970-01-01 00:00:00 001
        Date time = new Date(1); // 注意：参数是一个毫秒

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        // 北京是东8区，差8个小时
        System.out.println(sdf.format(time)); //1970-01-01 08:00:00 001

        // 想获取昨天的此时的时间
        //long nowTimeMillis = System.currentTimeMillis();
        //long lastTimeMillis = nowTimeMillis - 1000*60*60*24;
        Date time2 = new Date(System.currentTimeMillis() - 1000*60*60*24);
        System.out.println(sdf.format(time2)); // 2026-03-18 16:03:35 591

        // 获取去年的此时的时间
        Date time3 = new Date(System.currentTimeMillis() - (long)1000*60*60*24*365);
        System.out.println(sdf.format(time3)); // 2025-03-19 16:05:25 699
    }
}
