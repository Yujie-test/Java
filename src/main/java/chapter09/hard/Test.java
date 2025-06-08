package chapter09.hard;

/*
	对象的创建和使用
*/

public class Test {
	public static void main(String[] args) {
		Address a = new Address();
		a.city = "Beijing";
		a.street = "Daxing";
		a.zipcode = "121221";

		User u = new User();
		System.out.println(u.id); // 0
		System.out.println(u.name); // null
		System.out.println(u.addr); // null

		u.id = 1111;
		u.name = "zhangsan";
		u.addr = a;
		System.out.println(u.id); // 1111
		System.out.println(u.name); // zhangsan
		System.out.println(u.addr);

		// 思考一个问题：我想知道张三他是哪个城市的，代码该怎么写
		System.out.println(u.addr.city);
		System.out.println(u.addr.street);
		System.out.println(u.addr.zipcode);
	}
}

