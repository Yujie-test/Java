package day03;/*
	关于java语言当中的整数型：
		byte、short、int、long
	1、java语言当中的“整数型字面值”被默认当作int类型来处理，要让这个”整数型字面值“被当作long类型来处理的话，需要在”整数型字面值“后面添加l/L，建议使用大写的L
	2、java语言当中的整数型字面值有三种表示方式：
		第一种方式：十进制「是一种缺省默认的方式」
		第二种方式：八进制「在编写八进制整数型字面值的时候需要以0开始」
		第三种方式：十六进制「在编写十六进制整数型字面值的时候需要以0x开始」

*/

public class DataTypeTest04{

	public static void main(String[] args){
		int a = 10;
		int b = 010;
		int c = 0x10;
		System.out.println(a); //10
		System.out.println(b); //8
		System.out.println(c); //16

		System.out.println(a+b+c); //34

		//123这个整数型字面值是int类型
		//i变量声明的时候也是int类型
		//int类型的123赋值给int类型的变量i，不存在类型转换
		int i = 123;
		System.out.println(i);

		//456这个整数型字面值是int类型,占用4个字节
		//x变量在声明的时候是long类型，占用8个字节
		//int类型的字面值赋值给long类型的变量x，存在类型转换
		//int类型转换成long类型
		//int类型是小容量
		//long类型是大容量
		//小容量可以自动转换成大容量，称为自动类型转换机制

		long x = 456;
		System.out.println(x);

		//2147483647字面值是int类型，占用4个字节
		//y=变量在声明的时候是long类型，占用8个字节，自动类型转换
		long y = 2147483647;
		System.out.println(y);

		//编译错误：过大的整数: 2147483648
		//2147483648被当作int类型4个字节处理，但是这个字面值超出int类型范围
		//long z = 2147483648;

		//解决错误
		//2147483648字面值一上来就当作long类型来处理，在字面值后面添加L
		long z = 2147483648L;
		System.out.println(z);



	}
}
