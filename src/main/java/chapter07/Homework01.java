package chapter07;

/*
	1、编写一个方法，求整数n的阶乘
*/
public class Homework01 {
	public static void main(String[] args) {
		int res = factorial(6);
		System.out.println(res);
	}

	// 1、编写一个方法，求整数n的阶乘
	public static int factorial(int n){
		int res = 1;
		for(int i = n; i > 1; i--){
			res *= i;
		}
		return res;
	}
}

