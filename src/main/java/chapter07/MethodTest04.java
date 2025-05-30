package chapter07;

/*
	在方法调用的时候，什么时候“类名.”是可以省略的，什么时候不能省略
		a()方法调用b()方法的时候，a和b方法都在同一个类中，“类名.”是可以省略的。
		如果不在同一个类中，“类名.”不能省略。
*/

// 类1
public class MethodTest04 {

	public static void println3(){
		System.out.println("Hello World3!");
	}

	// 入口
	public static void main(String[] args) {
		// 调用println()方法
		MethodTest04.println();
		MethodTest04.println2();
		MethodTest04.println3();

		// “类名.”可以省略吗
		println();
		println2();
		println3();

		// 第一次跨类调用
		// 像这种情况下，“类名.”就不能省略了
		MyClass.println();
	}

	public static void println(){
		System.out.println("Hello World!");
	}

	public static void println2(){
		System.out.println("Hello World2!");
	}
}

// 类2
class MyClass{
	public static void println(){
		System.out.println("Hello!");
	}

	public static void println2(){
		System.out.println("Hello2!");
	}

	public static void println3(){
		System.out.println("Hello3!");
	}
}