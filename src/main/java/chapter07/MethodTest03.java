package chapter07;

/*
	1、方法怎么定义，语法机制是什么
		[修饰符列表] 返回值类型 方法名(形式参数列表) {
			方法体;
		}

		注意：
			[]符号叫做中括号，以上中括号里面的内容不是必须的，是可选的，方法体由java语句构成

		1.1 关于修饰符列表
			修饰符列表不是必选项，是可选的。目前为止，大家同意写成public static void
*/

public class MethodTest03 {
	// 方法定义在类体当中
	// 方法定义的先后顺序没有关系，都可以
	/*public static void sumInt(int x, int y) { // 自上而下的循序依次逐行执行
		int z = x + y;
		System.out.println(x + " + " + y + " = " + z);
	}*/

	// 入口主方法
	public static void main(String[] args) {
		// 需求1：请编写程序，计算100和200的和
		sumInt(100, 200);
		// 需求2：请编写程序，计算666和888的和
		sumInt(666, 888);
		// 需求3：请编写程序，计算111和222的和
		sumInt(111, 222);
	}

	// 专门在这个类体当中定义一个方法，这个方法专门来完成求和
	// x y z在以下的sumInt方法中都属于局部变量
	// 局部变量有一个特点：方法结束之后，局部变量占用的内存会自动释放
	public static void sumInt(int x, int y) { // 自上而下的循序依次逐行执行
		int z = x + y;
		System.out.println(x + " + " + y + " = " + z);
	}

	public static void sum() {
		// 错误：找不到符号
		//System.out.println(z);
	}
}

