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
		Student s1 = new Student();

		// 创建学生对象s2
		// s2也属于局部变量
		Student s2 = new Student();

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

