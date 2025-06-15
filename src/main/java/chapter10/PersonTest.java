package chapter10;

/*
*/

// 在外部程序中访问Person这个类型的数据
public class PersonTest {
	public static void main(String[] args) {
		// 创建Person对象
		Person p = new Person();

		// 访问人的年龄
		// 访问一个对象的属性，通常包括两种操作，一种是读数据，一种是改数据
		// 读数据
		System.out.println(p.age); // 读（get表示读取）

		// 修改数据（set表示修改/设置）
		p.age = 50;

		// 再次读取
		System.out.println(p.age);

		// 在PersonTest这个外部程序中目前是可以随意对age属性进行操作的
		// 一个人的年龄不应该为负数
		// 程序给年龄赋值了一个负数，按说是不符合业务要求的，但是程序目前还是让他通过了
		// 其实这就是一个程序的bug
		p.age = -100; // 改（随意在这里对Person内部的数据进行改变，导致了不安全）
		System.out.println(p.age); // 读
	}
}

