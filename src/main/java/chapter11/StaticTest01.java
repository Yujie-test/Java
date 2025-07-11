package chapter11;

/*
	static：
		1、static翻译为“静态”
		2、所有static关键字修饰的都是类相关的，类级别的
		3、所有static修饰的都是采用“类名.”的方式访问
		4、static修饰的变量：静态变量
		5、static修饰的方法：静态方法

	变量的分类：
		变量根据声明的位置进行划分：
			在方法体当中声明的变量叫做：局部变量
			在方法体外声明的变量叫做：成员变量

		成员变量又可以分为：
			实例变量
			静态变量
*/

public class StaticTest01 {

	public static void main(String[] args) {

	}
}

class VarTest{

	// 以下实例的，都是对象相关的，访问时采用“引用.”的方式访问，需要先new对象
	// 实例相关的，必须先有对象才能访问，可能会出现空指针异常
	// 成员变量中的实例变量
	int i;

	// 实例方法
	public void m2(){
		// 局部变量
		int x = 200;

	}

	// 以下静态的，都死活类相关的，访问时采用“类名.”的方式访问，不需要new对象
	// 不需要对象的参与即可访问，没有空指针异常的发生
	// 成员变量中的静态变量
	static int k;

	// 静态方法
	public static void m1(){
		// 局部变量
		int m = 100;

	}

}

