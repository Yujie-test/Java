package day03;/*
	关于java编程中运算符之：条件运算符（三目运算符）
		语法格式：
			布尔表达式 ? 表达式1 : 表达式2
		执行原理是什么？
			布尔表达式的结果为true时，表达式1的结果作为整个表达式的结果
			布尔表达式的结果为false时，表达式2的结果作为整个表达式的结果
*/

public class OperatorTest05 {
	public static void main(String[] args){
		// 编译报错，不是语句
		//100;

		boolean sex = false;
		//sex ? "male" : "female"; // 编译报错，不是语句
		// 前面的变量c的类型不能随意编写，最终的计算结果是字符型，所以最终变量也需要使用char类型
		char c = sex ? 'M' : 'F';
		System.out.println(c);

		String s = sex ? "Male" : "Female";
		System.out.println(s);

		// 实际开发中不会这样
		//char c = sex ? 'M' : "F"; // 不兼容的类型

		// 这样可以
		// System.out.println(这里很牛，因为这里什么类型的数据都能放)
		System.out.println(sex ? 'M' : "Female");
	}
}

