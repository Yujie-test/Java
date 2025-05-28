package chapter06;

/*
	continue语句：
		1、continue翻译为：继续
		2、continue语句和break语句要对比着学
		3、continue语句的作用是：
			终止当前“本次”循环，直接进入下一次循环继续执行
			for (){
				if () { // 当这个条件成立时，执行continue语句
					continue; // 当这个continue执行时，continue下面的代码不执行，直接进入下一次循环执行
				}
				// 以上的continue一旦执行，以下的代码不执行，直接执行更新表达式
				code1;
				code2;
				code3;
				code4;
				......
			}
		4、continue语句后面可以指定循环吗？
			可以，这里就不再讲了，自己测试一下
			a:for (; ; 更新表达式) {
				b:for (; ; 更新表达式) {
					if () {
						continue a; // 直接执行循环a的更新表达式
					}
					code1;
					code2;
					code3;
					code4;
					......
				}
			}

*/
public class ContinueTest01 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++){
			if (i == 5) {
				break;
			}
			System.out.println("i = " + i);
		}
		System.out.println("-----------------------------------------");

		for (int i = 0; i < 10; i++){
			if (i == 5) {
				continue;
			}
			System.out.println("i = " + i);
		}
	}
}

