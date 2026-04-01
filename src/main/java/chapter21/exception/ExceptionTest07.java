package chapter21.exception;

/*
    深入try、catch
        1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型
        2、catch可以写多个，建议catch的时候，精确的一个一个处理，这样有利于程序的调试
        3、catch写多个的时候：从上到下，必须遵循从小到大
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest07 {
    public static void main(String[] args) {
        // 编译报错
        /*try {
            FileInputStream fis = new FileInputStream("D:\\Git\\Java\\src\\test\\Metho");
        } catch (NullPointerException e) {
        }*/

        /*try {
            FileInputStream fis = new FileInputStream("D:\\Git\\Java\\src\\test\\Metho");
            System.out.println("以上出现异常，这里无法执行！");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        System.out.println("Hello World!");*/

        /*try {
            FileInputStream fis = new FileInputStream("D:\\Git\\Java\\src\\test\\Metho");
        } catch (IOException e) { // 多态：IOException e = new FileNotFoundException();
            System.out.println("File not found!");
        }*/

        /*try {
            FileInputStream fis = new FileInputStream("D:\\Git\\Java\\src\\test\\Metho");
        } catch (Exception e) { // 多态：Exception e = new FileNotFoundException();
            System.out.println("File not found!");
        }*/

        /*try {
            // 创建输入流
            FileInputStream fis = new FileInputStream("D:\\Git\\Java\\src\\test\\Metho");
            // 读文件
            fis.read();
        } catch (Exception e) { // 所有的异常都走这个分支
            System.out.println("File not found!");
        }*/

        /*try {
            // 创建输入流
            FileInputStream fis = new FileInputStream("D:\\Git\\Java\\src\\test\\Metho");
            // 读文件
            fis.read();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e1) {
            System.out.println("读文件报错了！");
        }*/

        // 编译报错
        /*try {
            // 创建输入流
            FileInputStream fis = new FileInputStream("D:\\Git\\Java\\src\\test\\Metho");
            // 读文件
            fis.read();
        } catch (IOException e) {
            System.out.println("读文件报错了！");
        } catch (FileNotFoundException e1) {
            System.out.println("File not found!");
        }*/

        // JDK8的新特性
        try {
            // 创建输入流
            FileInputStream fis = new FileInputStream("D:\\Git\\Java\\src\\test\\Metho");

            // 进行数学运算
            System.out.println(100 / 0); // 这个异常是运行时异常，编写程序时可以处理，也可以不处理
        } catch (FileNotFoundException | ArithmeticException | NullPointerException e) {
            System.out.println("文件不存在？数学异常？空指针异常？");
        }
    }
}
