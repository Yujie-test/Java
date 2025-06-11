package chapter09.hard;

/*
	绘制内存图

	对象和引用的区别？
		对象：堆内存里new出来的
		引用：存储对象内存地址的一个变量

	思考：
		引用一定是局部变量吗？
			不一定
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
		// 拆分成以下代码和以上效果完全相同，原理完全相同，不同的是以下代码多了两个变量
		System.out.println(u.addr.city);
		System.out.println(u.addr.street);
		System.out.println(u.addr.zipcode);

		// u.addr.city这行代码可否拆分呢？
		Address ad = u.addr;
		String ct = ad.city;
		System.out.println(ct);

		// ----------------是否理解以下代码-----------------------------
		int x = 100;
		// =代表赋值运算，“赋值”中有一个“值”
		// x变量中的值是100，将100复制一份给y
		// 表示：将x变量中保存的值复制一份给y、
		int y = x;

		// ----------------是否理解以下代码-----------------------------
		Address k = new Address(); // Address k = 0x1111
		Address m = k; // 这里表示将k变量中保存的0x1111复制了一份传给了m变量
	}
}

