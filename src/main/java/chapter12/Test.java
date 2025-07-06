package chapter12;

/*


*/

// System.out.println("Exam");
// 以上代码中：System、out、println都是标识符
public class Test {
	// 静态变量
	static Student stu = new Student();

	public static void main(String[] args) {
		Test.stu.exam();

	}
}

// 父类
class Student{
	// 实例方法
	public void exam() {
		System.out.println("Exam");
	}
}
