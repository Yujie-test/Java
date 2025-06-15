package chapter09.Constructor;

/*
	调用不同的构造方法创建对象
*/

public class ConstructorTest03 {
	public static void main(String[] args) {

		Vip v1 = new Vip();
		System.out.println(v1.no);
		System.out.println(v1.name);
		System.out.println(v1.birth);
		System.out.println(v1.sex);

		Vip v2 = new Vip(1111L, "zhangsan");
		System.out.println(v2.no);
		System.out.println(v2.name);
		System.out.println(v2.birth);
		System.out.println(v2.sex);

		Vip v3 = new Vip(2222L, "lisi", "2000-01-01");
		System.out.println(v3.no);
		System.out.println(v3.name);
		System.out.println(v3.birth);
		System.out.println(v3.sex);

		Vip v4 = new Vip(3333L, "wangwu", "1999-12-31", true);
		System.out.println(v4.no);
		System.out.println(v4.name);
		System.out.println(v4.birth);
		System.out.println(v4.sex);
	}
}

