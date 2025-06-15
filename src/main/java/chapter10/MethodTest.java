package chapter10;

/*
	带有static的方法
	没有static的方法
	分别怎么调用？
		带有static的方法通过“类名.”的方式访问

	对象被称为实例
	实例相关的有：实例变量、实例方法
	实例变量是对象变量，实例方法是对象方法
	实例相关的都需要new对象，通过“引用.”的方法去访问
*/

public class MethodTest {
	public static void main(String[] args) {
		MethodTest.doSome();
		// “类名.” 可以省略（在同一个类中）
		doSome();

		// 尝试使用“类名.”的方式访问“实例方法”
		// 错误的，无法从静态上下文中引用非静态 方法 doOther()
		//MethodTest.doOther();

		// 创建对象
		MethodTest mt = new MethodTest();
		// 通过“引用.”的方法去访问实例方法
		mt.doOther();

	}

	// 带有static
	public static void doSome(){
		System.out.println("do some!!!");
	}

	// 这个方法没有static，这样的方法被称为：实例方法（对象方法，对象级别的方法）
	public void doOther(){
		System.out.println("do other!!!");
	}
}
