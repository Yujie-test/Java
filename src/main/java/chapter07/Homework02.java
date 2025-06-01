package chapter07;

/*
	2、编写一个方法，输出大于某个正整数n的最小质数
*/
public class Homework02 {
	public static void main(String[] args) {
		int res =minPrimeNum2(13);
		System.out.println(res);

		boolean flag = ifPrimeNum(10);
		System.out.println(flag ? "质数" : "非质数");

		int res1 =minPrimeNum(100);
		System.out.println(res1);
	}

	// 2、编写一个方法，输出大于某个正整数n的最小质数
	public static int minPrimeNum2(int n){ // n = 3
		boolean flag = true;
		int i = n + 1; // i = 4
		while (flag){
			int j = 2;
			for (; j < i; j++){
				if (i % j == 0){ // j = 2 3 4
					break;
				}
			}
			if (j == i){
				flag = false;
			} else {
				i ++; // 5
			}
		}
		return i;
	}

	// 定义一个专门的方法，来判断某个数字是否为质数
	// 形参：被判断的数字num
	// 返回值：类型是boolean，true表示是质数，false表示不是质数
	public static boolean ifPrimeNum(int n){
		for (int i = 2; i < n; i++){
			if (n % i == 0){
				return false;
			}
		}
		return true;
	}

	public static int minPrimeNum(int n){ // 9
		int i = n + 1; // 10
		while(!ifPrimeNum(i)){
			i ++;
		}
		return i;
	}
}

