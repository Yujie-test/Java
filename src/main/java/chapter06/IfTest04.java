package chapter06;

import java.util.Objects;

/*
	业务要求：
		1、从键盘上接收天气的信息
			1表示：雨天
			0表示：晴天
		2、同时从键盘上接收性别的信息：
			1表示：男
			0表示：女
		3、当天气是雨天的时候：
			男的：打一把大黑伞
			女的：打一把小花伞
		4、当天气是晴天的时候：
			男的：直接走起，出去玩耍
			女的：擦点防晒霜，出去玩耍
		需要使用if语句以及嵌套的方式展现这个业务

		可以在程序的开始，接收两个数据，一个数据是天气，一个数据是性别，然后将这两个数据保存在变量中
*/
public class IfTest04 {
	public static void main(String[] args) {
		// 键盘扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入今天的天气（1表示雨天，0表示晴天）：");
		int weather = s.nextInt();
		System.out.print("请输入你的性别（1表示男，0表示女）：");
		int sex = s.nextInt();
		String str = "天气输入有误，请检查您的输入";
		if (weather == 1){
			if (sex == 1){
				str = "打一把大黑伞";
			} else if (sex == 0) {
				str = "打一把小花伞";
			} else {
				str = "性别输入有误，请检查您的输入";
			}
		} else if (weather == 0) {
			if (sex == 1){
				str = "直接走起，出去玩耍";
			} else if (sex == 0) {
				str = "擦点防晒霜，出去玩耍";
			} else {
				str = "性别输入有误，请检查您的输入";
			}
		}
		System.out.println(str);
	}
}

