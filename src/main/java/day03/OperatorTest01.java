package day03;/*
	关于java编程中运算符之：算术运算符
		+ 	求和
		- 	相减
		* 	乘积
		/ 	商
		% 	求余数

		++ 	自加一
		-- 	自减一

		注意：
			一个表达式当中有多个运算符，运算符有优先级，不确定加小括号，优先级得到提升
*/

public class OperatorTest01 {
	public static void main(String[] args){
		int i = 10;
		int j = 3;

		System.out.println(i + j);
		System.out.println(i - j);
		System.out.println(i * j);
		System.out.println(i / j);
		System.out.println(i % j);

		// 以下以++为例，--运算符自学
		// 关于++运算符 「自加一」
		int k = 10;

		// ++运算符可以出现在变量后面「单目运算符」
		k ++;
		System.out.println(k);

		int y = 10;
		// ++运算符可以出现在变量前面「单目运算符」
		++ y;
		System.out.println(y);

		/*
		小结：
			++运算符可以出现在变量前，也可以出现在变量后，无论是变量前还是变量后，只要++运算结束，该变量中的值一定会自加一
		*/

		// ++ 出现在变量后，先做赋值运算，再对变量中的值进行自加一
		int a = 100;
		int b = a ++;
		System.out.println(a); // 101
		System.out.println(b); // 100

		// ++ 出现在变量前，先对变量中的值进行自加一，再做赋值运算
		int m = 20;
		int n = ++m;
		System.out.println(m); // 21
		System.out.println(n); // 21

		int xx = 500;
		System.out.println(xx);

		int e = 100;
		System.out.println(e++); // 100
		System.out.println(e); // 101

		int s = 100;
		System.out.println(++s); // 101
		System.out.println(s); // 101
	}
}

