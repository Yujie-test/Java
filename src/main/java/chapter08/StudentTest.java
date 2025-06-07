package chapter08;

/*
	对象的创建和使用
		创建对象的语法是什么
			new 类名();
		类是模版，通过一个类，是可以创建N多个对象的
		new是一个运算符，专门负责对象的创建
*/

public class StudentTest {
	public static void main(String[] args) {
		/*
		解释一下：
			i是变量名
			int是变量的数据类型
			10是具体的数据

			s1是变量名（只是一个变量名，不能称之为对象）
			Student是变量s1的数据类型（引用数据类型）
			new Student() 这是一个对象（学生类创建出来的学生对象）

			数据类型包括两种：
				基本数据类型：byte short int long float double boolean char
				引用数据类型：String，Student ......
			java中所有的“类”都属于引用数据类型
		*/
		Student s1 = new Student(); // 和int i = 10;一个道理

		// 再通过该类创建一个全新的对象
		Student s2 = new Student();

		// 再创建一个
		Student s3 = new Student();

		// 以上的程序就相当于通过Student类实例化了3个Student对象
		// 创建对象的个数没有限制，可以随意，只要有模版类就行。
		// 3个对象都属于学生类型
	}
}

