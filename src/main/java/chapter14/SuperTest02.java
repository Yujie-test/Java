package chapter14;

/*
	在java语言中，不管是new什么对象，最后老祖宗的Object类的无参数构造方法一定会执行
	（Object类的无参数构造方法一定处于栈顶部）

	栈顶的特点：最后调用但最先执行。后进先出原则

	大家要注意：
		以后写代码的时候，一个类的无参构造方法还是建议大家手动的写出来，
		如果无参数构造方法丢失的话，可能会影响到“子类对象的创建”
*/

public class SuperTest02 {
	public static void main(String[] args) {
		new C();
		// 13654

	}
}

class A1{
	// 建议手动的将一个类的无参数构造方法写出来
	public A1(){
		System.out.println("A类的无参数构造方法执行");
	} //1
}

class B1 extends A{
	public B1(){
		System.out.println("B类的无参数构造方法执行"); //2
	}

	public B1(String name){
		System.out.println("B类的有参数构造方法执行（String）"); //3
	}
}

class C extends B1{
	public C(){
		this("zhangsan");
		System.out.println("C的无参数构造执行"); //4
	}
	public C(String name){
		this(name, 20);
		System.out.println("C的有参数构造执行（String）"); //5
	}

	public C(String name, int age){
		super(name);
		System.out.println("C的有参数构造执行（String, int）"); //6
	}
}

