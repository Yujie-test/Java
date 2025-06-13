package chapter09.Constructor;

/*
*/

public class Student {

	// 学号（成员变量）
	int no; // 这种成员变量又被称为“实例变量”，实际上就是对象级别的变量

	// 姓名
	String name;

	// 年龄
	int age;

	// 当前的Student这个类没有任何构造方法
	// 但是系统实际上会自动给Student类提供一个无参数的构造方法
	// 将无参数的构造方法（缺省构造器）写出来
	public Student() {
		System.out.println("无参数的构造方法执行了");
	}

	// 定义一个有参数的构造方法
	public Student(int i){

	}

	/*
		编译器检测到该方法名是“studen”，发现这个名字和类名不一致，
		编译器会认为该方法是一个普通方法，普通方法应该有返回值，
		但是没有写返回值类型，所以报错了
		错误：方法声明无效；需要返回值类型
	*/

	/*public Studen(int i){

	}*/


}

