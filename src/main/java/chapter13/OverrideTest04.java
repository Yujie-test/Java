package chapter13;

/*
	关于Object类中的toString方法
		1、
*/

public class OverrideTest03 {
	public static void main(String[] args) {
		// 创建中国人对象
		//Chinese c = new Chinese("Jack"); // 错误原因：没有这样的构造方法
		Chinese c = new Chinese();
		c.setName("Jack");
		c.speak();

		// 创建美国人对象
		//American a = new American("Jack"); // 错误原因：没有这样的构造方法
		American a = new American();
		a.setName("Alice");
		a.speak();
	}
}

// 人
class People{
	// 属性
	private String name;

	// 构造
	public People(){}
	public People(String name){
		this.name = name;
	}

	// getter and setter
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	// 人都会说话
	public void speak() {
		System.out.println(name + " is speaking!");
	}
}

// 中国人
class Chinese extends People{
	// 中国人说话是汉语
	// 所以子类需要对父类的speak()方法进行重写
	public void speak() {
		System.out.println(this.getName() + " is speaking Chinese!");
	}
}

// 美国人
class American extends People{
	// 美国人说话是英语
	// 所以子类需要对父类的speak()方法进行重写
	public void speak() {
		System.out.println(this.getName() + " is speaking English!");
	}
}