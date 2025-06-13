package chapter09.Constructor;

/*
	1、id，name，age都有默认值
	2、id的默认值是0
	name的默认值是null
	age的默认值是0
	3、思考：实例变量没有手动赋值的时候，实际上系统会默认赋值
	那么这个默认赋值操作是在什么时间进行的？
		是在类加载的时候给这些实例变量赋值吗？
			不是，实例变量是在构造方法执行的过程中完成初始化的
*/

public class User {

	// 3个属性，3个实例变量【对象变量】
	// 用户名id
	int id;

	// 用户名
	String name;

	// 年龄
	int age;

	// 手动定义有参数的构造方法，无参数构造方法会失效
	public User(int i) {

	}

	public User() {
		// 无参数构造方法体当中虽然什么代码都没写
		// 但是实际上是在这个方法体里面进行的实例变量默认值初始化
		/*id = 0;
		name = null;
		age = 0;*/

		// 这就表示不再采用系统默认值，手动赋值了
		id = 111;
		name = "lisi";
		age = 30;
	}
}

