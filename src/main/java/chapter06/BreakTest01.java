package chapter06;

/*
	break语句：
		1、break语句比较特殊，特殊在：break语句是一个单词成为一个完整的java语句。另外：continue也是这样，他俩都是一个单词成为一条语句
		2、break翻译为：折断、弄断
		3、break语句可以用在哪？
			用在两个地方，其他位置不行
				1）switch语句当中，用来终止switch语句的执行。用在switch语句当中，防止case穿透现象，用来终止switch
				2）用在循环语句当中，用来终止循环的执行：
					for
					while
					do ... while ...
		4、以下程序主要是以for循环为例学习break转向语句
		5、break语句的执行并不会让整个方法结束；break语句主要是用来终止离他最近的那个循环语句
		6、怎么用break语句终止指定的循环
			第一步：你需要给循环起一个名字，例如
				a:for () {
					b:for () {
					}
				}
			第二步：终止：break a;
*/
public class BreakTest01 {
	public static void main(String[] args) {
		// 输出0-9
		/*for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}*/

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				// break;语句会让离他最近的循环终止掉
				break; // 终止的不是if，不是针对if的，而是针对离他最近的循环
			}
			System.out.println("i = " + i);  // 0 1 2 3 4
		}

		// 这里的代码照常执行，break语句的执行并不会影响这里
		System.out.println("Hello World");

		// 这个for循环两次
		for (int j = 0; j < 2; j++) { // 外层for
			for (int i = 0; i < 10; i++) { // 内层for
				if (i == 5) {
					break; // 这个break语句只能终止离他最近的for
				}
				System.out.println("i ==> " + i);  // 0 1 2 3 4
			}
		}
		System.out.println("-----------------------------------------");

		// 以下讲解的内容，以后开发很少用
		a:for (int j = 0; j < 2; j++) {
			b:for (int i = 0; i < 10; i++) {
				if (i == 5) {
					break a; // 终止指定的循环
				}
				System.out.println("i ==> " + i);
			}
		}
		System.out.println("The End!");
	}
}

