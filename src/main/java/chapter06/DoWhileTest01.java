package chapter06;

/*
	while循环：
		1、while循环的语法机制以及执行原理
			语法机制：
				while (布尔表达式) {
					循环体;
				}
			执行原理：
				判断布尔表达式的结果，如果为true就执行循环体，循环体结束之后，再次判断布尔表达式的结果，
				如果还是true，继续执行循环体，直到布尔表达式结果为false，while循环结束
		2、while循环的循环次数是：0-n次
*/
public class DoWhileTest01 {
	public static void main(String[] args) {
		// 死循环
		/*while (true) {
			System.out.println("死循环");
		}*/

		// 本质上while循环和for循环原理是相同的
		for (int i = 0; i < 10; i++) {
			System.out.println("i --> " + i);
		}

		/*int i = 0;
		while (i < 10) {
			System.out.println("i = " + i); // 0 1 2 3 4 5 6 7 8 9
			i++;
		}*/

		// for和while完全可以互换，只不过就是语法格式不一样
		for (int i = 0; i < 10; ) {
			i++;
			System.out.println("i --> " + i);
		}

		int i = 0;
		while (i < 10) {
			i++;
			System.out.println("i = " + i); // 1 2 3 4 5 6 7 8 9 10
		}
	}
}

