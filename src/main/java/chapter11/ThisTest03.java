package chapter11;

/*
	1、this可以使用在实例方法中，不能使用在静态方法中。
	2、this关键字大部分情况下可以省略，什么时候不能省略呢？
		在实例方法中，或者构造方法中，为了区分局部变量和实例变量，这种情况下：“this.”是不能省略的
*/

public class ThisTest03 {

	public static void main(String[] args) {
		Student1 s = new Student1();
		s.setNo(111);
		s.setName("zhangsan");

		System.out.println(s.getNo());
		System.out.println(s.getName());

		Student1 s2 = new Student1(222, "lisi");
		System.out.println(s2.getNo());
		System.out.println(s2.getName());
	}
}

// 学生类
class Student1{
	// 学号
	private int no;
	// 姓名
	private String name;

	// 无参构造方法
	public Student1(){}
	// 有参构造方法
	/*public Student1(int i, String s){
		no = i;
		name = s;
	}*/

	// 上面的构造方法也增强一下可读性
	public Student1(int no, String name){
		this.no = no;
		this.name = name;
	}

	// setter and getter方法
	/*public String getName() {
		return name;
	}
	public void setName(String s) {
		name = s;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int i) {
		no = i;
	}*/

	public String getName() {
		return name;
		// return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
		//return this.no;
	}
	public void setNo(int no) {
		this.no = no; // “this.”的作用是区分局部变量和实例变量
	}
	/*public void setNo(int no) { // 就近原则
		no = no; // 这两个no都是局部变量的no，和实例变量no没关系
	}*/
}

