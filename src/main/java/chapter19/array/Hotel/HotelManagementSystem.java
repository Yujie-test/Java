package chapter19.array.Hotel;

/*
    第二题：
        为某个酒店编写程序：酒店管理系统，模拟订房、退房、打印所有房间状态等功能
        要求：
            1、该系统的用户是：酒店前台
            2、酒店使用一个二维数组来模拟 “Room[][] rooms;”
            3、酒店中的每一个房间应该是一个java对象：Room
            4、每一个Room应该有：房间编号、房间类型属性、房间是否空闲
            5、系统应该对外提供的功能：
                可以预定房间：用户输入房间编号，订房
                可以退房：用户输入房间编号，退房
                可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间的状态
*/

import java.util.Arrays;
import java.util.Scanner;

public class HotelManagementSystem {
    public static void main(String[] args) {
        /*// 创建酒店对象
        Hotel hotel1 = new Hotel();
        // 打印房间状态
        hotel1.printHotel();

        Hotel hotel2 = new Hotel(2, 3);
        hotel2.printHotel();*/
        Hotel hotel = new Hotel();

        /*
        首先输出一个欢迎页面
         */
        System.out.println("Welcome to hotel management system, please read instruction carefully!");
        System.out.println("Please enter function code: [1] print room list, [2] order room, [3] check out, [0] exit system");
        Scanner s = new Scanner(System.in);

        // 一直可以使用（死循环）
        while (true){
            System.out.println("Please enter the function code you'd like to choose: ");
            int functionCode = s.nextInt();
            if (functionCode == 1){
                // 查看房间列表
                hotel.printHotel();
            } else if (functionCode == 2) {
                // 订房
                System.out.println("Please enter the room number you'd like to order: ");
                int roomNo = s.nextInt();
                hotel.order(roomNo);
            } else if (functionCode == 3) {
                // 退房
                System.out.println("Please enter the room number you'd like to exit: ");
                int roomNo = s.nextInt();
                hotel.exit(roomNo);
            } else if (functionCode == 0) {
                // 退出系统
                System.out.println("You have exit the hotel management system, see you next time!");
                return;
            } else {
                System.out.println("Wrong function code, please check and reenter!");
            }
        }
    }
}
