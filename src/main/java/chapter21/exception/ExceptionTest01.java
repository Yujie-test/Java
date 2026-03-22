package chapter21.exception;

/*
    1、什么是异常，java提供异常机制有什么用？
        以下程序执行过程中发生了不正常的情况，而这种不正常的情况叫做：异常
        java语言是很完善的语言，提供了异常的处理方式，以下程序执行过程中出现了不正常情况
        java把该异常打印输出到控制台，供程序员参考。程序员看到异常信息之后，可以对程序进行修改，让程序更加的健壮

            什么是异常：程序执行过程中的不正常情况
            异常的作用：增强程序的健壮性

    2、以下程序执行控制台出现了：
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	        at chapter21.exception.ExceptionTest01.main(ExceptionTest01.java:16)
	    这个信息被我们称为：异常信息，这个信息是JVM打印的
*/

public class ExceptionTest01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a / b;
        // 实际上JVM在执行到此处时，会new异常对象：ArithmeticException( / by zero)
        // 并且JVM将new的异常对象抛出，打印输出异常信息
        System.out.println(a + " / " + b + " = " + c);

        // 我观察到异常信息之后，对程序进行修改，更加健壮
        /*int a = 10;
        int b = 0;
        if (b == 0){
            System.out.println("除数不能为0！");
            return;
        }
        // 程序执行到此处表示除数一定不是0
        int c = a / b;
        System.out.println(a + " / " + b + " = " + c);*/
    }
}
