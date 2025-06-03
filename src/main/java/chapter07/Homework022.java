package chapter07;

/*
	2、编写一个方法，输出大于某个正整数n的最小质数
*/
public class Homework022 {
	public static void main(String[] args) {
		boolean flag = ifPrimeNum(10);
		System.out.println(flag ? "质数" : "非质数");

		minPrimeNum(7);
	}

	public static boolean ifPrimeNum(int n){
		for (int i = 2; i < n; i++){
			if (n % i == 0){
				return false;
			}
		}
		return true;
	}

	public static void minPrimeNum(int n){
		while(!ifPrimeNum(++n)){
		}
		System.out.println(n);
	}
}

