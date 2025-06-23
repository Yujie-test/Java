package chapter11;

/*
	栈：方法只要执行，会压栈（局部变量）
	堆：new出来的对象都在堆中。垃圾回收器只要针对（实例变量）
	方法区：类的信息，字节码信息，代码片段（静态变量）

	方法的代码片段放在方法区，但是方法执行过程中需要的内存在栈中
*/

public class StaticTest07 {

	// 静态变量在什么时候初始化？类加载时初始化
	// 静态变量存储在哪里？方法区
	static int i = 100;


	// 静态代码块什么时候执行？类加载时执行
	static {
		// 这里可以访问i吗
		System.out.println(i);
	}

	// 实例变量
	int k = 111; // k变量是实例变量，在构造方法执行时内存空间才会开辟

	static String name = "zhangsan";

	static {
		// k变量可以访问吗？
		// static静态代码块在类加载时执行，并且只执行一次
		// 类加载时，k变量空间还没有开辟出来呢
		// 错误：无法从静态上下文中引用非静态 变量 k
		//System.out.println(k);

		// 这里可以访问name吗？
		// 错误：非法前向引用
		// 静态代码块和静态变量都在类加载的时候执行，时间相同，只能靠代码的顺序来决定谁先谁后
		System.out.println(name);
	}

	// 静态变量在静态代码块下面
	//static String name = "zhangsan";

	// 入口（main方法执行前实际上执行了很多代码）
	public static void main(String[] args) {
		System.out.println("main begin");
	}

	// 在一个类体中的两个方法，x方法和y方法是没有先后顺序的
	public static void x(){}

	public static void y(){}
}

/*
	总结：
		java语言有顺序要求的是：
			第一：对于一个方法来说，方法体中的代码是有顺序的，遵循自上而下的顺序执行
			第二：静态代码块1和静态代码块2是有先后顺序的
			第三：静态代码块和静态变量是有先后顺序的
*/

