package chapter09;

/*
	第一步：类加载
	第二步：调用UserTest类的main方法（方法调用要压栈）
*/

public class UserTest {
	public static void main(String[] args) {

		// 方法体当中声明的变量叫做局部变量

		User u1 = new User();
		u1.id = 11111;
		u1.name = "zhangsan";
		u1.password = "123";
		System.out.println(u1.id);
		System.out.println(u1.name);
		System.out.println(u1.password);

		User u2 = new User();
		u2.id = 22222;
		u2.name = "lisi";
		u2.password = "456";
		System.out.println(u2.id);
		System.out.println(u2.name);
		System.out.println(u2.password);
	}
}

