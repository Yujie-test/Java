package chapter21.exception.homework;

import java.util.Scanner;

public class Entrance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入用户名，长度在[6, 14]：");
        String username = s.next();

        System.out.println("请输入密码：");
        String password = s.next();

        // 创建UserService对象
        UserService us = new UserService();
        try {
            us.register(username, password);
        } catch (UsernameLengthException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}
