package chapter14;

/*
	1、“this.”和“super.”大部分情况下都是可以省略的。
	2、”this.“什么时候不能省略
		public Customer1(String name){
		this.name = name;
		}
	3、”super.“什么时候不能省略
		父中有，子中又有，如果想在子中访问“父的特征”，”super.“不能省略
*/

public class SuperTest05 {
	public static void main(String[] args) {
		Vip1 v = new Vip1("Jenny");
		v.shopping();
	}
}

class Customer1{
	String name;

	public Customer1(){}
	public Customer1(String name){
		this.name = name;
	}

	public void doSome(){
		System.out.println(this.name + "do some!");
		System.out.println(name + "do some!");
		// 错误：找不到符号
		//System.out.println(super.name + "do some!");
	}
}

//
class Vip1 extends Customer1 {
	// 假设子类也有一个同名属性
	// java中允许在子类中出现和父类一样的同名变量/同名属性
	String name; // 实例变量
	public Vip1(){}

	public Vip1(String name){
		super(name);
		//this.name = null;
	}

	public void shopping(){
		/*
			java是怎么来区分子类和父类的同名属性的？
				this.name: 当前对象的name属性
				super.name: 当前对象的父类特征中的name属性
		*/
		// this表示当前对象
		System.out.println(this.name + " is shopping"); //null is shopping
		// super表示的是当前对象的父类型特征。（super是this指向的那个对象中的一块空间）
		System.out.println(super.name + " is shopping"); //Jenny is shopping
		System.out.println(name + " is shopping"); //null is shopping
	}
}
