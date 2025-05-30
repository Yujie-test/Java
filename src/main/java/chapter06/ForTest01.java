package chapter06;

/*
	1、控制语句：
		1.1 关于循环语句
			for循环
			while循环
			do ... while循环

		什么是循环语句，为什么要使用这种语句
			因为在现实世界中，有很多事情都是需要反复/重复的去做
			对应到程序当中，如果有一块代码需要重复执行，此时为了减少代码量，我们使用循环语句

*/
// 演示一下，为什么要使用循环
// 循环语句的出现就是为了解决代码的复用性
public class ForTest01 {
	public static void main(String[] args) {
		// 要求在控制台上输出100个100
		/*System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);*/
		// 重复的代码太多了
		// 简化一下以上的代码，可以使用循环
		// 什么时候可以考虑使用循环呢？相同的代码重复出现的时候，可以使用循环语句
		for (int i = 0; i < 100; i++) {
			System.out.println(100);
		}
	}
}

