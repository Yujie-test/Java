package chapter21.exception;

/*
    异常对象的两个方法：
        String msg = exception.getMessage();
        exception.printStackTrace(); // 一般都是使用这个

    我们以后查看异常的追踪信息，我们应该怎么看，可以快速的调试程序呢？
        异常信息追踪信息，从上往下一行一行看
        但是需要注意的是：SUN写的代码就不用看了（看包名就知道是自己的还是SUN的）。
        主要的问题是出现在自己编写的代码上
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest09 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            // 获取异常的简单描述信息
            String msg = e.getMessage();
            System.out.println(msg); //D:\Git\Java\src\test\Metho (No such file or directory)

            // 打印异常堆栈追踪信息！！！
            // 在实际的开发中，建议使用这个，养成好习惯！
            // 这行代码要写上，不然出问题你也不知道
            //e.printStackTrace();

            /*
            java.io.FileNotFoundException: D:\Git\Java\src\test\Metho (No such file or directory)
	            at java.io.FileInputStream.open0(Native Method)
	            at java.io.FileInputStream.open(FileInputStream.java:195)
	            at java.io.FileInputStream.<init>(FileInputStream.java:138)
	            at java.io.FileInputStream.<init>(FileInputStream.java:93)
	            at chapter21.exception.ExceptionTest09.m3(ExceptionTest09.java:33)
	            at chapter21.exception.ExceptionTest09.m2(ExceptionTest09.java:29)
	            at chapter21.exception.ExceptionTest09.m1(ExceptionTest09.java:25)
	            at chapter21.exception.ExceptionTest09.main(ExceptionTest09.java:16)
	            因为33行出问题导致29行
	            29行出问题导致25行
	            25行出问题导致16行
	            应该先查看33行的代码，33行是代码错误的根源
	        */

            // 这里的程序不耽误执行，很健壮（服务器不会因为遇见异常而宕机）
            System.out.println("Hello World!");
        }
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("D:\\Git\\Java\\src\\test\\Metho");
    }
}
