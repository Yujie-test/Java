package chapter09.方法调用时参数传递问题;

/*
*/

// 分析程序的输出结果
// java中规定：参数在传递的时候，和类型无关，不管是基本数据类型还是引用数据类型
// 统一都是将盒子中保存的数值复制一份，传递下去

// java中只有一个规定：参数传递的时候，一定是将“盒子”中的东西复制一份传递过去。

// 内存地址也是值，也是盒子中保存的一个东西
public class Test2 {
	public static void main(String[] args) {

		Person p = new Person();
		p.age = 10;
		add(p);
		System.out.println("add ---------> " + p.age); //11
	}

	// 方法的参数可以是基本数据类型，也可以是引用数据类型，只要是合法的数据类型就行
	public static void add(Person p){
		p.age++;
		System.out.println("add ---------> " + p.age); //11
	}
}

class Person{
	// 年龄属性，成员变量中的实例变量
	int age;
}

