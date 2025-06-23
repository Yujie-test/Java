package chapter11;

/*
	1、除了静态代码块之外，还有一种语句块叫做：实例语句块
	2、实例语句块在类加载时并没有执行
	3、实例语句块语法：
		{
			java语句;
			java语句;
			java语句;
		}
	4、实例语句块在什么时候执行？
		只要是构造方法执行，必然在构造方法执行之前自动执行“实例语句块”中的代码。
		实际上这也是SUN公司为java程序员准备的一个特殊时机，叫做对象构建时机
*/

public class InstanceCode {

	// 入口
	public static void main(String[] args) {

		System.out.println("main begin");
		new InstanceCode();
		new InstanceCode();

		new InstanceCode("abc");
		new InstanceCode("xyz");
	}

	// 实例语句块
	{
		System.out.println("Instance Code Execute!");
	}

	// Constructor
	public InstanceCode(){
		System.out.println("Without construct method");
	}

	// Constructor
	public InstanceCode(String name){
		System.out.println("With construct method");
	}
}


