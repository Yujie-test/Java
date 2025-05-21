package day03;
/*
	1、输出信息到控制台：
		 System.out.println();
	2、在java中怎么接收键盘的输入呢
		前提：java.util.Scanner s = new java.util.Scanner(System.in);
		接收一个整数：
			int userInputNum = s.nextInt();
		接受一个字符串：
			String username = s.next();
*/
public class KeyInput {
	public static void main(String[] args){
		// 创建一个键盘扫描器对象
		// s是变量名，可以改
		java.util.Scanner s = new java.util.Scanner(System.in);

		// 接收用户的输入，从键盘上接受一个int类型的数据
		// 代码执行到这里的时候会暂停下来，等待用户的输入，用户可以从键盘上输入一个整数，然后回车，回车之后userInputNum变量就有值了
		// 并且userInputNum变量中保存的这个值就是用户输入的数字
		// userInputNum就是接收键盘数据的
		int userInputNum = s.nextInt(); // s是变量名，userInputNum是变量名
		System.out.println("您输入的数字是：" + userInputNum);

		// 代码执行到此处又会停下来，等待用户输入
		// 敲完回车，s.nextInt(); 代码执行结束
		// 如果输的不是数字，那么会出现异常：InputMismatchException
		int j = s.nextInt();
		System.out.println("您输入的数字是：" + j);

		// 输入字符串
		System.out.print("请输入用户名：");
		String username = s.next();
		System.out.println("欢迎回来" + username + "回来");
	}
}

