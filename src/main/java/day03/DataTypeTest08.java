package day03;/*
	关于基本数据类型之间的互相转换：转换规则
		1、八种基本数据类型当中除布尔类型之外剩下的7中类型之间都可以互相转换
		2、小容量向大容量转换，称之为自动类型转换，容量从小到大排序：
			byte < short < int < long < float < double
				   char <
		    注：
		    	任何浮点类型不管占用多少个字节，都比整数型容量大
		    	char和short可表示的种类数量相同，但是char可以取更大的正整数
		3、大容量转换小容量，叫做强制类型转换，需要加强制类型转换符，程序才能编译通过，但是在运行阶段可能会损失精度，所以谨慎使用。
		4、当整数字面值没有超出byte、short、char的取值范围，可以直接赋值给byte、short、char类型的变量
		5、byte、short、char混合运算的时候，各自转换成int类型再做运算
		6、多种数据类型混合运算，先转换成容量最大的那种类型再做运算
		注意：
			byte b = 3; 可以编译通过，3没有超出byte类型取值范围
			int i = 10;
			byte b = i / 3 编译报错：编译器只检查语法，不会运算i / 3
*/

public class DataTypeTest08 {
	public static void main(String[] args){
		// 出现错误，1000超出了byte的范围
		//byte a = 1000;
		byte a = 20;
		// 出现错误，变量不能重名
		//short a = 1000;
		short b = 1000;
		int c = 1000;
		// 正确，可以自动转换
		long d = c;
		// 错误，出现精度丢失问题，大类型-->小类型
		//int e = d;
		// 将long强制转换成int类型，因为1000没有超出int类型范围，所以转换正确
		int e = (int)d;
		// 因为java中的运算会转成最大类型，10和3默认为int，所以运算后的最大类型也是int
		int f = 10 / 3; //3
		double m = 10.0 / 3; // 3.3333333333
		System.out.println(m);
		double m1 = 10 / 3; // 3.0
		System.out.println(m1);

		long g = 10;
		// g是long类型，3默认是int类型，做运算时结果为最大类型也就是long类型。long类型赋值给int类型需要强制类型转换
		//int h = g / 3;
		int h = (int)g / 3;
		long h1 = g / 3;
		// 优先级问题：将g转换成int，又将int类型的g转换成byte跟3做运算，最后结果是int，把int类型赋值给byte类型，出现精度损失错误
		//byte h2 = (byte) (int)g / 3;
		byte h2 = (byte) (int)(g / 3);
		short i = 10;
		byte j = 5;
		//short k = i + j;
		short k = (short) (i + j);
		int k1 = i + j;
		char l = 'a';
		System.out.println(l);
		System.out.println((byte)l);

		int s = l + 100;
		System.out.println(s);

	}
}

