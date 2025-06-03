package chapter07;

/*
*/

public class MethodTest09 {
	public static void main(String[] args) {
		// 调用sum方法
		int res = sum(10, 20);
		System.out.println(res);

		// 上面两行代码能否合并为一行？可以
		System.out.println(sum(100, 200));

		System.out.println(m());

		boolean flag = m();
		if (flag) {
			System.out.println("True");
		}

		if (m()) {
			System.out.println("True");
		}

		System.out.println(m() ? "True" : "False");

		System.out.println(!m() ? "True" : "False");
	}

	public static boolean m(){
		return true;
	}


	// 求和的方法
	public static int sum(int a, int b){ // i是局部变量
		return a + b;
	}
}

