package chapter17;

import java.util.Scanner;
//import java.util.*;
public class Test03 {
    public static void main(String[] args) {

        // 为什么要这样写？
        // Test03类和Scanner类不在同一个包下。
        // java.util就是Scanner类的包名
        //java.util.Scanner s = new java.util.Scanner(System.in);
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println("Your import is: " + str);

        java.lang.String name = "zhangsan";
        System.out.println(name);

        String name1 = "lisi";
        System.out.println(name1);
    }
}
