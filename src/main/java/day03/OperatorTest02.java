package day03;/*
	关于java编程中运算符之：关系运算符
		>
		>=
		<
		<=
		==
		!=
		一定要记住一个规则：
			所有的关系运算符的运算结果都是布尔类型
			不是true就是false，不可能是其他值

		在java语言中：
			=：赋值运算符
			==：关系运算符，判断是否相等
		注意：关系运算符中有过有两个符号的话，两个符号之间不能有空格
*/

public class OperatorTest02 {
	public static void main(String[] args){
		int a = 10;
		int b = 10;
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
	}
}

