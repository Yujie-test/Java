package chapter09;

/*
	对象的创建和使用
*/

public class StudentTest {
	public static void main(String[] args) {

		// 访问学生姓名可以直接通过类名吗
		// 学生姓名是一个实例变量，实例变量是实例级别的变量
		// 是不是应该现有对象才能说姓名的事
		// 不能通过类名来直接访问实例变量
		//System.out.println(Student.name);

		// i属于局部变量吗？是
		// 局部变量存储在栈内存中（栈主要存储局部变量）
		//int i = 100;

		// 创建学生对象s1
		// s1属于局部变量吗？是
		// s1这个局部变量叫做引用
		Student s1 = new Student();
		// 怎么访问实例变量
		// 语法：引用.实例变量名
		System.out.println(s1.id);
		System.out.println(s1.sex);
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.address);

		System.out.println("---------------------------------------");

		// 创建学生对象s2
		// s2也属于局部变量
		// s1也叫做引用
		Student s2 = new Student();
		System.out.println(s2.id);
		System.out.println(s2.sex);
		System.out.println(s2.age);
		System.out.println(s2.name);
		System.out.println(s2.address);
		System.out.println("---------------------------------------");

		// 程序执行到此处 我能修改s1这个学生的学号吗
		s1.id = 110;
		s1.name = "张三";
		s1.age = 20;
		s1.sex = true;
		s1.address = "深圳保安区";
		System.out.println(s1.id);
		System.out.println(s1.sex);
		System.out.println(s1.age);
		System.out.println(s1.name);
		System.out.println(s1.address);

		// 再创建一个
		Student s3 = new Student();
	}
	public static void method(){
		// i s1 s2都是main方法中的局部变量，在这里是无法访问的
		/*System.out.println(i);
		System.out.println(s1);
		System.out.println(s2);*/
	}
}

