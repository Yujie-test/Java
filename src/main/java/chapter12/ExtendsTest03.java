package chapter12;

/*
	测试：子类继承父类之后，能使用子类对象调用父类方法吗？
		本质上，子类继承父类之后，是将父类继承过来的方法归为自己所有。
		实际上调用的也不是父类的方法，是他子类自己的方法（因为已经继承过来了，就属于自己的。）

*/

public class ExtendsTest03 {
	public static void main(String[] args) {
		// 创建子类对象
		Cat c = new Cat();
		// 调用方法
		c.move();
		// 通过子类对象访问name可以吗？
		System.out.println(c.name);
	}
}

// 父类
class Animal{
	// 名字（先不封装）
	String name = "flower"; // 默认值不是null，给一个flower

	// 提供一个动物移动的方法
	public void move() {
		System.out.println(name + " is moving!");
	}
}

// Cat子类
// Cat继承Animal，会将Animal中所有的全部继承过来
class Cat extends Animal{

}