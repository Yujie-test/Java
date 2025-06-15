package chapter10;

/*
*/

// 在外部程序中访问Person这个类型的数据
public class PersonTest02 {
	public static void main(String[] args) {
		// 创建Person对象
		Person p = new Person();

		// Person的age，彻底在外部不能访问了，但是这有点太安全了
		// age不能访问，这个程序意义就不大了
		// age 在 chapter10.Person 中是 private 访问控制
		/*// 读age属性的值
		System.out.println(p.age);

		// 修改age属性的值
		p.age = 50;

		// 读age
		System.out.println(p.age);*/
	}
}

