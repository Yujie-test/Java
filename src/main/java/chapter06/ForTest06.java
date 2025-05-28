package chapter06;

/*
	九九乘法表
		特点：
			1、共9行
			2、第一行1个，第二行2个，第三个三个，第n行n个
		最重要的是：慢慢的把思路捋出来，再写代码
*/
public class ForTest06 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j <= i){
					System.out.print(j + "*" + i + "=" + (i * j) + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		// 9行，循环9次
		for (int i = 1; i < 10; i++) { // 纵向循环
			// 负责输出一行的。（内部for循环负责将一行上的全部输出。）
			for (int j = 1; j <= i; j++) { // i是行号
				System.out.print(j + "*" + i + "=" + (i * j) + " ");
			}
			// 换行
			System.out.println();
		}
	}
}

