package chapter09.Constructor;

/*
	构造方法
		1、什么是构造方法，有什么用
			构造方法是一个比较特殊的方法，通过构造方法可以完成对象的创建，
			以及实例变量的初始化，换句话说：构造方法是用来创建对象，
			并且同时给对象的属性赋值（注意：实例变量没有手动赋值的时候，系统赋默认值）
		2、重点：当一个类没有提供任何构造方法，系统实际上会自动给Student类提供一个无参数的构造方法
		（而这个构造方法被称为缺省构造器）
		3、调用构造方法怎么调用？
			使用new运算符来调用方法
		4、构造方法的语法结果？
			[修饰符列表] 构造方法名(形式参数列表){
				构造方法体;
				通常在构造方法体当中给属性赋值，完成属性的初始化。
			}

			注意：
				第一，修饰符列表目前统一写public，千万不要写public static
				第二，构造方法名和类名必须一致
				第三，构造方法不需要指定返回值类型，也不能写void，写上void表示普通方法，就不是构造方法了

			普通方法的语法结构：
			[修饰符列表] 返回值类型 方法名(形式参数列表){
				方法体;
			}
*/

public class ConstructorTest01 {
	public static void main(String[] args) {

		// 调用Student类的无参数调用方法
		new Student();

		// 调用普通方法
		ConstructorTest01.doSome();
		doSome();

		// 创建Student类型的对象
		Student s1 = new Student();

		// 输出“引用”
		// 只要输出的结果不是null，说明这个对象一定是创建完成了
		System.out.println(s1); // Student@14ae5a5

		Student s3 = new Student(100);
		System.out.println(s3);

	}
	public static void doSome() {
		System.out.println("Do some method！");
	}
}

