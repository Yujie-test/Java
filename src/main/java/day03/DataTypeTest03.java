package day03;/*
	关于java语言当中的char类型：
		转义字符 \

	转义字符出现在特殊字符之前，会将特殊字符转换成普通字符

	\n 换行符
	\t 制表符
	\' 普通的单引号
	\\ 普通的反斜杠
	\" 普通的双引号

*/

public class DataTypeTest03{

	static char c11;

	public static void main(String[] args){

		//普通的n字符
		char c1 = 'n';
		System.out.println(c1);

		//编译通过，这说明以下并不是一个字符串，而是一个字符
		//这是一个“换行符”，属于char类型的数据
		//反斜杠在java语言当中具有转义功能
		char c2 = '\n';
		System.out.println(c2);

		//println表示输出之后换行，print表示输出，但是不换行
		System.out.print("Hello");
		System.out.println("World!");

		char x = 't';
		System.out.println(x);

		//制表符tab
		char y = '\t';
		System.out.println(x);

		System.out.print('A');
		System.out.print('\t');
		System.out.println('B');

		//要求在控制台上输出反斜杠字符
		//反斜杠将后面的单引号转译成不具备特殊含义的普通单引号字符
		//左边的单引号缺少了结束的单引号字符，编译报错
		//System.out.println('\');
		System.out.println('\\');

		//在控制台上输出一个普通的单引号字符
		System.out.println('\'');

		char f = '"';
		System.out.println(f);

		System.out.println("\"Hello World!\"");

		//JDK中自带的native2ascii.exe命令，可以将文字转换成unicode编码形式
		//在命令行输入native2ascii，回车，然后输入文字之后回车即可得到unicode编码
		// 反斜杠u代表后面的一串数字是某个文字的unicode编码
		char n = '\u4e2d'; //'中'对应的unicode编码是 4e2d   2d：46  4e：79
		System.out.println(n);

		//char类型的默认值
		char c10 = '\u0000';
		System.out.println(c10);
		System.out.println(c11+1);


	}
}

/*
	十进制: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 ......
	二进制：0 1 10 11 100 101 ......
	十六进制：0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20 ......
	八进制：0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20 ......

*/