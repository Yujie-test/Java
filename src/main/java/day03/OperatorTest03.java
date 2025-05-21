package day03;/*
	关于java编程中运算符之：逻辑运算符
		& 	逻辑与（并且）：两边都是true，结果才是true
		| 	逻辑或（或者）：一边是true，结果就是true
		! 	逻辑非（取反）
		&& 	短路与
		|| 	短路或
	用普通话描述的话：100大于99并且大于98，有道理
	用代码描述的话：100 > 99 & 100 > 98 --> true

	非常重要：
		逻辑运算符两边要求都是布尔类型，并且最终的运算结果也是布尔类型，这是逻辑运算符的特点
*/

public class OperatorTest03 {
	public static void main(String[] args){
		// 对于逻辑与运算来说，只要有一边是false，结果就是false
		// 只有两边同为ture，结果才是true
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & false); // false

		System.out.println(100 > 90 & 100 > 101); // false
		System.out.println((100 > 90) & (100 > 101)); // false
		int a = 100;
		int b = 101;
		int c = 90;
		System.out.println(a < b & a > c); // true

		// 对于逻辑或，只要有一边是true，结果就是true
		System.out.println(a < b | c > b); // true
		System.out.println(true | false); // true
		System.out.println(true | true); // true
		System.out.println(false | false); // false

		System.out.println(!false); // true
		System.out.println(!true); // false
		// 注意：这里需要加一个小括号
		System.out.println(!(a > b)); // true

		/*
			关于短路与 &&，短路或 ||
			其中重点学习短路与，短路或照葫芦画瓢

			短路与&&和逻辑与&有什么区别？
				首先这两个运算符的运算结果没有任何区别，完全相同
				只不过“短路与&&”会发生短路现象
			什么是短路现象呢？
				右边表达式不执行
			什么时候用&&，什么时候用&？
				从效率方面来说，&& 比 & 的效率高一些
				因为逻辑与不管第一个表达式结果是什么都会执行第二个表达式

				以后的开发中，短路与和逻辑与还是需要同时并存的
					大部分情况下都建议使用短路与 &&
					只有当既需要左边表达式执行又需要右边表达式执行的时候才会使用逻辑与
		*/
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && false); // false

		// 什么是短路现象，什么时候会发生“短路”
		int x = 10;
		int y = 11;
		// 逻辑与什么时候结果为true（两边都是true，结果才是true）
		System.out.println(x > y & x > y++); // 左边的x>y表达式结果已经是false了，其实整个表达式的结果已经是false了，按道理来说右边的表达式不应该执行
		// 由于y=12，通过这个测试得出x > y++这个表达式执行了
		System.out.println(y); // 12

		// 测试短路与 &&
		int m = 10;
		int n = 11;
		System.out.println(m > n && m > n++);
		// 使用短路与的时候，当左边的表达式为false的时候，右边的表达式不执行
		System.out.println(n); // 11

		// 什么时候发生短路或 || 现象？
		// 左边表达式为true，右边表达式不需要执行，发生短路
	}
}

