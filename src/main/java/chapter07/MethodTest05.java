package chapter07;

/*
	Main begin
	m1 begin
	m2 begin
	m3 begin
	T's m3 method execute!
	m3 over
	m2 over
	m1 over
	Main over

	main方法最先执行，并且main方法是最后一个结束的。
	main结束，整个程序就结束了。
*/

// 任何一个方法体当中的代码都是遵循自上而下的循序依次逐行执行的
public class MethodTest05 {
	public static void main(String[] args) {
		System.out.println("Main begin");
		// 调用m1方法
		m1();
		System.out.println("Main over");
	}

	public static void m1(){
		// 调用程序不一定写到main方法中，不要把main方法特殊化。
		// main方法也是一个普通方法
		System.out.println("m1 begin");
		m2();
		System.out.println("m1 over");
	}

	// m2方法可以调用T类的m3方法吗？
	public static void m2(){
		System.out.println("m2 begin");
		T.m3();
		System.out.println("m2 over");
	}
}

class T{
	public static void m3(){
		System.out.println("m3 begin");
		System.out.println("T's m3 method execute!");
		System.out.println("m3 over");
	}
}

