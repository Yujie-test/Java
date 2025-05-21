package day03;/*
	关于java编程中运算符之：赋值运算符

*/

public class OperatorTest04 {
	public static void main(String[] args){
		// 对于逻辑与运算来说，只要有一边是false，结果就是false
		// 只有两边同为ture，结果才是true
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & false); // false

		System.out.println(100 > 90 & 100 > 101); // false
		System.out.println((100 > 90) & (100 > 101)); // false
		int a = 100;
		int b = 101;
		int c = 90;
		System.out.println(a < b & a > c); // true

		// 对于逻辑或，只要有一边是true，结果就是true
		System.out.println(a < b | c > b); // true
		System.out.println(true | false); // true
		System.out.println(true | true); // true
		System.out.println(false | false); // false

		System.out.println(!false); // true
		System.out.println(!true); // false
		// 注意：这里需要加一个小括号
		System.out.println(!(a > b)); // true
	}
}

