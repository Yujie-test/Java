package chapter13.PolymorphismBasic;

/*

*/

// 猫类：子类
public class Cat extends Animal{

	// 对move方法进行重写
	public void move(){
		System.out.println("Cat is walking!");
	}

	// 猫除了move之外，应该有自己的特定行为，例如抓老鼠
	// 这个行为是子类型对象特有的方法
	public void catchMouse(){
		System.out.println("Cat is chasing a mouse!");
	}
}