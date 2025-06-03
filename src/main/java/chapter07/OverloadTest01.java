package chapter07;

/*
	方法重载机制？
		1、以下程序先不使用方法重载机制，分析程序的缺点
			以下程序没有语法错误，运行也是正常的，分析一个代码风格存在什么缺陷

			sumInt, sumLong, sumDouble三个方法不是功能相同，是功能相似

			缺点包括两个：
				第一：代码不美观，不好看（次要的）
				第二个：程序员需要记忆更多的方法名称
*/

public class OverloadTest01 {
	// 主方法
	public static void main(String[] args) {
		int x = sumInt(10, 20);
		System.out.println(x);

		long y = sumLong(10L, 20L);
		System.out.println(y);

		double z = sumDouble(10.0, 20.0);
		System.out.println(z);
	}

	// 定义一个计算int类型数据的求和方法
	public static int sumInt(int a, int b) {
		return a + b;
	}

	// 定义一个计算long类型数据的求和方法
	public static long sumLong(long a, long b) {
		return a + b;
	}

	// 定义一个计算double类型数据的求和方法
	public static double sumDouble(double a, double b) {
		return a + b;
	}
}

