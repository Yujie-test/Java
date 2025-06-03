package chapter07;

/*
*/

public class OverloadTest04 {
	public static void main(String[] args) {
		// 大家是否承认：println是一个方法名
		// println这个方法是SUN公司的java团队写的，直接用就行
		// println()方法肯定是重载了（可以翻阅源代码）
		// 对于println()方法来说，我们只需要记忆这一个方法名就行
		// 参数类型可以随便传，这说明println()方法重载了
		System.out.println(10);
		System.out.println(3.14);
		System.out.println(true);
		System.out.println('a');
		System.out.println("abc");
	}
}

