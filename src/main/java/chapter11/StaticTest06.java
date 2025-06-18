package chapter11;

/*
	1、使用static关键字可以定义静态代码块
	2、什么是静态代码块，语法是什么？
		static {
			java语句;
			java语句;
		}
	3、static静态代码块在什么时候执行呢？
		类加载时执行，并且只执行一次，静态代码块有这样的特征/特点
	4、注意：静态代码块在类加载时执行，并且在main方法执行之前执行
	5、静态代码块一般是按照自上而下的顺序执行
	6、静态代码块有什么用？
		第一：静态代码块不是那么常用（不是每一个类）
		第二：静态代码块这种语法机制实际上是SUN公司给我们java程序员的一个特殊的时刻/时机
		这个时机叫做类加载时机

	具体的业务：
		项目经理说了，大家注意了，所有我们编写的程序中，只要类加载了，请记录一下类加载的日志信息
		（在哪年哪月哪日几时几分几秒，哪个类加载到JVM当中了）
		思考：这些记录日志的代码写到哪里呢？
			写到静态代码块中

*/

public class StaticTest06 {

	// 静态代码块（特殊的类加载时机）
	static {
		System.out.println("static block1");
	}

	// 一个类当中可以编写多个静态代码块
	static {
		System.out.println("static block2");
	}

	public static void main(String[] args) {
		System.out.println("main");
	}

	// 编写一个静态代码块
	static {
		System.out.println("static block3");
	}
}

/*
static block1
static block2
static block3
main
*/

