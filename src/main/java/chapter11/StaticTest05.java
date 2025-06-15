package chapter11;

/*
	关于方法来说，什么时候定义为实例方法？什么时候定义为静态方法？
		有没有参考方法

		此方法一般都是描述了一个行为，如果说该行为必须由对象去触发
		那么该方法定义为实例方法。

		参考标准：
			当这个方法体当中，直接访问类实例变量，这个方法一定是实例方法。
			我们以后开发中，大部分情况下，如果是工具类的话，工具类当中的方法一般都是静态的
			（静态方法有一个优点，是不需要new对象，直接采用类名调用，极其方便。工具类就是为例方便，
			所以工具类中的方法一般都是static的。）

			什么是工具类？就是为了方便编程而开发的一些类

	类 = 属性 + 方法
		属性描述的是状态
		方法描述的是：行为动作

	一个方法代表了一个动作

	什么时候方法定义为实例？
		张三考试得分，90
		李四考试得分，100
		不同的对象参加考试的结果不同。
		我们可以认定“考试”这个行为是与对象相关的行为。
		建议将“考试”这个方法定义为实例方法
*/

public class StaticTest05 {
	public static void main(String[] args) {
		User u = new User();
		System.out.println(u.getId()); //0

		//User.getId();

		User x = new User();
		x.printName();
	}
}

class User{

	// 实例变量，需要对象
	private int id;

	// 实例变量
	private String name; // 首先先分析的是，这个name是对象级别的，一个对象一份

	// 分析这个方法应该定义为实例方法还是静态方法呢？
	// 打印用户的名字这样的一个方法
	public void printName(){
		System.out.println("用户的名字是：" + name);
	}

	/*public static void printName(){
		// 输出的是一个对象的name
		System.out.println("用户的名字是：" + name);
	}*/


	public void setId(int i){
		id = i;
	}

	public int getId(){
		return id;
	}

	/*public static int getId(){
		return id;
	}*/
}

