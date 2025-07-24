package chapter13.PolymorphismBasic;

/*

*/

// 鸟类：子类
public class Bird extends Animal{

	// 对move方法进行重写
	public void move(){
		System.out.println("Bird is flying!");
	}

	// 也有子以特有的方法
	public void sing(){
		System.out.println("Bird is singing!");
	}
}