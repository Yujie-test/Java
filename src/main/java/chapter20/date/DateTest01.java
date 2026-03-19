package chapter20.date;
/*
    java中对日期的处理
        这个案例最主要是掌握：
            知识点1：怎么获取系统当前时间
            知识点2：String ---> Date
            知识点3：Date ---> String

*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) throws ParseException {
        // 获取系统当前时间（精确到毫秒的系统当前时间）
        // 直接调用无参数构造方法就行
        Date nowTime = new Date();

        // java.util.Date类的toString()方法已经被重写了
        // 输出的应该不是一个对象的内存地址，应该是一个日期字符串
        System.out.println(nowTime); //Thu Mar 19 10:51:55 CST 2026

        // 日期可以格式化吗？
        // 将日期类型Date，按照指定的格式进行转换：Date --转换成具有一定格式的日期字符串 --> String
        // simpleDateFormat是java.text包下的。专门负责日期格式化的
        /*
        yyyy 年（年是4位）
        MM 月（月是2位）
        dd 日（日是2位）
        HH 时（时是2位）
        mm 分（分是2位）
        ss 秒（秒是2位）
        SSS 毫秒？（毫秒3位，最高999，1000毫秒代表1秒）
        注意：在日期格式中，除了y M d H m S s这些字符不能随便用之外，剩下的符号格式自己随意组织
         */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd MM:HH:ss");

        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);

        // 假设现在有一个日期字符串String，怎么转换成Date类型
        // String ---> Date
        //SimpleDateFormat sdf = new SimpleDateFormat("格式不能随便写，要和日期字符串格式相同");
        // 注意：字符串的日期格式和SimpleDateFormat对象指定的日期格式要一致，不然会出现异常：java.text.ParseException
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date dateTime = sdf2.parse(nowTimeStr);
        System.out.println(dateTime); //Thu Mar 19 11:13:47 CST 2026
    }
}
