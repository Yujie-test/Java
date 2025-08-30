package chapter14;

/*

*/

public class SuperTest07 {

	// 静态方法，主方法
	public static void main(String[] args) {

	}
}

class Animal{
	public void move(){
		System.out.println("Animal move!");
	}
}

class Cat extends Animal{
	// 对move进行重写
	public void move(){
		System.out.println("Cat move!");
	}

	// 单独编写一个子类特有的方法
	public void yiDong(){
		this.move();
		move();
		super.move();
	}
}