package day03;/*
	关于java编程中运算符之：+ 运算符
		1、+ 运算符在java语言中有两个作用
			作用1:求和
			作用2:字符串拼接
		2、什么时候求和，什么时候进行字符串拼接？
			当 + 运算符两边都是数字类型的时候，求和
			当 + 运算符两边的任意一边是字符串类型，那么这个+会进行字符串拼接操作
		3、一定要记住：字符串拼接完之后的结果还是一个字符串
*/

public class OperatorTest06 {
	public static void main(String[] args){
		// 定义一个年龄的变量
		int age = 35;
		// + 这里会进行字符串拼接操作
		System.out.println("年龄 = " + 35);

		int a = 100;
		int b = 200;
		// 这里的 + 两边都是数字，所以加法运算
		int c = a + b;
		System.out.println(c); // 300

		// 注意：当一个表达式中有多个加号的时候，遵循自左向右的顺序依次执行（除非额外添加了小括号，小括号优先级高）
		System.out.println(a + b + "110"); // "300110"
		System.out.println(a + (b + "110")); // "100200110"
		System.out.println(a + b + 110); // 410

		// 在控制台上输出“100 + 200 = 300”
		System.out.println("100 + 200 = 300");
		System.out.println(a + " + " + b + " = " + c);
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " + " + b + " = " + a + b); // 100 + 200 = 100200
		// '+' char 类型转换为int类型运算
		System.out.println(100 + '+' + 200 + '=' + 300); // = 100 + 43 + 200 + 61 + 300 = 704

		// 在java语言中怎么定义字符串类型的变量呢
		// String是字符串类型，并且String类型不属于基本数据类型范畴，属于引用类型
		// name是变量名，只要是合法的标识符就行
		// "jack"是一个字符串类型的字面量
		String name = "jack"; // String类型是字符串类型，其中S是大写，不是string

		// 错误：类型不兼容
		//String name = 100;

		// 会进行字符串的拼接
		System.out.println("登录成功，欢迎" + name + "回来");
	}
}

