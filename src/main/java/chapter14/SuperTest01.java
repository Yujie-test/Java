package chapter14;

/*
	私有方法不能覆盖
*/

public class SuperTest01 {
	public static void main(String[] args) {
		// 一般重写的时候都是复制粘贴，不要改
	}
}

// 在外部类中无法访问私有的
class Animal3{
	/*public double sum(int a, int b){
		return a + b;
	}*/b

	/*public int sum(int a, int b){
		return a + b;
	}*/
}

class Cat3 extends Animal3{
	// 重写
	// 错误：返回类型int与double不兼容
	/*
	public double sum(int a, int b){
		return a + b;
	}
	*/

	// 错误：返回类型double与int不兼容
	/*public double sum(int a, int b){
		return a + b;
	}*/
}

// 父类
class MyClass{
	public Animal3 getAnimal(){
		return null;
	}
}

// 子类
class MyClass1 extends MyClass{
	// 重写父类的方法
	// 重写的时候返回值类型由Animal变成了Cat，变小了（可以，Java中允许）
	/*public Cat3 getAnimal(){
		return null;
	}*/

	// 重写的时候返回值类型由Animal变成了Object，变大了（不可以，Java中不允许）
	// 错误：返回类型java.lang.Object与chapter13.Animal3不兼容
	/*public Object getAnimal(){
		return null;
	}*/
}
