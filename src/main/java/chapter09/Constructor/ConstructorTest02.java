package chapter09.Constructor;

/*
	1、构造方法对应的英语单词：Constructor【构造器】
	2、构造方法作用：
		创建对象，并且创建对象的过程中给属性赋值（初始化）
*/

public class ConstructorTest02 {
	public static void main(String[] args) {

		User u1 = new User();

		System.out.println(u1.id); //0
		System.out.println(u1.name); //null
		System.out.println(u1.age); //0

		User u2 = new User(1111);

		System.out.println(u2.id); //0
		System.out.println(u2.name); //null
		System.out.println(u2.age); //0

	}
}

