package day02;/*
	关于字面值：
		- 字面值
			* 10、100
			* 3.14
			* "abc"
			* 'a'
			* true, false
			......

		- 字面值就是数据
		- 字面值是java源文件的组成部分之一。包括标识符和关键字都是java源文件的组成部分
		- 数据在现实世界当中是分门别类的，所以数据在计算机编程语言当中也是有类型的：「数据类型」
			* 10、100         属于整数型字面值
			* 3.14            属于浮点型字面值
			* "abc"           属于字符串型字面值
			* 'a'             属于字符型字面值
			* true, false     属于布尔型字面值
		- 注意：
			java语言中所有的字符串型字面值必须用半角双引号括起来
			java语言中所有的字符型字面值必须用半角单引号括起来
*/

public class ConstTest01{

	// main是一个方法名
	public static void main(String[] args) {
		System.out.println("abc");
		System.out.println("最近你过得怎么样？");
		System.out.println(100);
		System.out.println(false);
		System.out.println('A');
		System.out.println(3.14);
		System.out.println("3.14");
		//编译报错，因为单引号中只能存放单个字符，属于字符型字面值
		//System.out.println('abc');

		//100是一个字面值，是一个整数型数值，那么既然是数据存储在内存中，必定会占用内存空间
		System.out.println(1111100);
		System.out.println(1111100);
		System.out.println(1111100);
		System.out.println(1111100);
		System.out.println(1111100);
	}
}

