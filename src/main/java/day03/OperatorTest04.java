package day03;/*
	关于java编程中运算符之：赋值运算符
		1、赋值运算符包括”基本赋值运算符“和“扩展赋值运算符”：基本的，扩展的
		2、基本赋值运算符
			=
		3、扩展赋值运算符
			+=
			-=
			*=
			/=
			%=
		4、很重要的语法机制：
			使用扩展运算符在编写的时候，永远都不会改变运算结果类型
			byte x = 100;
			x += 1;
			x自诞生以来是byte类型，那么变量的类型永远都是byte，不会变。不管后面是多大的数字
*/

public class OperatorTest04 {
	public static void main(String[] args){
		// 赋值运算符等号右边优先级比较高，先执行右边的表达式
		// 然后将表达式执行结果放到左边的”盒子“当中
		int i= 10;
		// 重新赋值
		i = 20;
		System.out.println(i);

		/*
			以+=运算符为代表，学习扩展赋值运算符
			其他运算符，例如：-=，*=，/=，%= 原理相似
		*/
		int k = 10;
		k += 20; // 30
		System.out.println(k);

		int m = 10;
		// += 运算符类似于下面表达式
		m = m + 20; // 30
		System.out.println(m);

		// 研究：i += 10 和 i = i + 10 真的完全一样吗？
		// 不一样，只能说相似，其实本质上并不是完全相同
		byte b = 100;
		System.out.println(b);

		// 报错
		//b = b + 1; // b是byte类型，1默认int类型，b+1为int类型，不能直接赋值给byte类型的b
		// 可以的，所以 b = b + 1 和 b += 1不一样
		// 其实 b += 1 等同于 b = (byte)(b + 1)
		b += 1;
		System.out.println(b); // 101
		// 早就超出了byte的取值范围了
		b += 199; // b = (byte)(b + 199)
		System.out.println(b); // 44（会自动损失精度）

		int x = 100;
		x += 100;
		System.out.println(x); // 200

		x -= 100;
		System.out.println(x); // 100

		x *= 10;
		System.out.println(x); // 1000

		x /= 30; // x = x / 30
		System.out.println(x); // 33

		x %= 10; // x = x % 10
		System.out.println(x); // 3





	}
}

