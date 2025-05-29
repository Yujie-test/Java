package chapter07;

/*
	这个程序是一个体验程序，体验一下方法的好处

	注意：
		程序开始执行的时候是先执行main方法，因为main方法是一个入口

	在java语言中所有的方法体中的代码都必须遵循自上而下的循序依次逐行执行

	main方法不需要手动调用，是由JVM调用的，但是除了main方法之外其他的方法都需要手动调用，方法才会执行
*/

public class MethodTest02 {
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

