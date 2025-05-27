package chapter06;

/*
	使用for循环实现1-100所有奇数求和，至少给出两种解决方案
*/
public class ForTest04 {
	public static void main(String[] args) {
		// 第二种方案：这种方案效率高，因为循环的次数比较少
		int cnt1 = 0;
		for (int i = 1; i < 100; i += 2) {
			// 这样写可以保证每一次取出的值都是奇数，不需要判断
			//System.out.println(i);
			cnt1 += i;
		}
		System.out.println(cnt1);

		// 第一种方案：
		// 思路：先找出1-100所有的奇数，然后再考虑求和的事
		// 第一步：先从1取到100，一个数字一个数字取出来
		// 第二步：既然可以取到每一个数字，那么我们进一步判断这个数字是否为奇数
		// 奇数对2求余数，结果都是1
		int cnt2 = 0;
		// for循环中嵌套了if语句
		for (int i = 1; i <= 100; i++) {
			//System.out.println(i);
			//int cnt2 = 0; // 不能在这个循环体中声明，这样会导致“计算器归0”
			if (i % 2 == 1) { // i 为奇数的条件
				cnt2 += i; // 累加 sum = sum + i;
			}
		}
		// 一定是在for循环全部结束之后，输出的sum就是最终的结果
		System.out.println(cnt2);
	}
}

