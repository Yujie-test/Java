package chapter06;

/*
	do .. while循环语句的执行原理以及语法机制
		语法机制：
			do {
				循环体;
			} while (布尔表达式);
		注意：do .. while循环最后的时候别漏掉分号

		执行原理：
			先执行循环体当中的代码，执行一次循环体之后，判断布尔表达式的结果，结果为true，则继续执行循环体，如果为false循环结束
		对于do .. while循环来说，循环体至少执行一次。循环体的执行次数是：1-n次。
*/
public class DoWhileTest01 {
	public static void main(String[] args) {
		/*int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 10); // 0 1 2 3 4 5 6 7 8 9*/

		/*int i = 0;
		do {
			System.out.println(i++); // 0 1 2 3 4 5 6 7 8 9
		} while (i < 10);*/

		int i = 0;
		do {
			System.out.println(++i); // 1 2 3 4 5 6 7 8 9 10
		} while (i < 10);

		// 至少执行一次循环体
		do {
			System.out.println("Hello World");
		} while (false);
	}
}

