package chapter21.exception;

/*
    处理异常的第一种方式：
        在方法声明的位置上使用throws关键字抛出，谁调用我这个方法，我就抛给谁。抛给调用者来处理
        这种处理异常的态度：上报

    处理异常的第二种方式：
        使用try、catch语句对异常进行捕捉，这个一场不会上报，自己把这个事处理了
        异常抛到此为止，不再上抛了。
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest06 {
    // 一般不建议在main方法上使用throws，因为这个异常如果真正发生了，一定会抛给JVM，JVM只有终止
    // 异常处理机制的作用就是增强程序的健壮性，怎么能做到，异常发生了也不影响程序的执行，所以一般main方法中的异常建议使用try、catch进行捕捉
    // main就不要继续上抛了
    /*public static void main (String[] args) throws FileNotFoundException{
        System.out.println("main begin!");
        m1();
        System.out.println("main end!");
    }*/

    public static void main(String[] args) {
        // 100 / 0 这是算数异常，这个异常是运行时异常，你在编译阶段，可以处理，也可以不处理。编译器不管
        //System.out.println(100/0); // 不处理编译器也不管
        // 你处理也可以
        /*try {
            System.out.println(100 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }*/

        System.out.println("main begin!");
        try {
            // try尝试
            m1();
        } catch (FileNotFoundException e) {
            // catch是捕捉异常后走的分支
            System.out.println("File not found!");
        }
        System.out.println("main end!");
    }

    private static void m1() throws FileNotFoundException{
        System.out.println("m1 begin!");
        m2();
        System.out.println("m1 end!");
    }

    // 抛别的不行，抛 ClassCastException说明你还是没有对FileNotFoundException进行处理
    //private static void m2() throws ClassCastException{
    // 抛 FileNotFoundException 的父类 IOException是可以的，因为 IOException 包括 FileNotFoundException
    // 这样也可以，因为 Exception 包括所有的异常
    //private static void m2() throws Exception {
    //private static void m2() throws ClassCastException, FileNotFoundException {
    private static void m2() throws FileNotFoundException {
        System.out.println("m2 begin!");
        // 编译器报错原因是：m3方法声明位置上有：throws FileNotFoundException
        // 我们在这里调用m3没有对异常进行预处理，所以编译器报错
        //m3();

        m3();
        System.out.println("m2 end!");
    }

    private static void m3() throws FileNotFoundException {
        // 调用SUN JDK中某个类的的构造方法
        // 这个类还没有接触过，后期IO流的时候就知道了
        // 我们只是借助这个类学习一下异常处理机制
        // 创建一个输入流对象，该流指向一个文件
        /*
            编译报错的原因：
                1、这里调用了一个构造方法 FileInputStream(String name)
                2、这个构造方法的声明位置上有 throws FileNotFoundException
                3、通过类的继承结构看到：FileNotFoundException父类是 IOException，IOException的父类是Exception
                最终得知：FileNotFoundException 是编译时异常

                错误原因？编译时异常要求程序员编写程序阶段必须对他进行处理，不处理编译器就报错*/
        //new FileInputStream("D:\\Git\\Java\\src\\test\\Method.txt");

        // 我们采用第一种处理方式：在方法声明的位置上使用throws继续上抛
        new FileInputStream("D:\\Git\\Java\\src\\test\\Method.txt");
    }
}
