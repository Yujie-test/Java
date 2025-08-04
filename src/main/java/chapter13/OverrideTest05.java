package chapter13;

/*
	关于Object类中的toString()方法
		1、toString()方法的作用是什么
			作用：将“Java对象”转换成字符串的形式

		2、Object类中toString()方法的默认实现是什么
			public String toString() {
				return getClass().getName() + "@" + Integer.toHexString(hashCode());
			}
			toString：方法名的意思是转换成String
			含义：调用一个java对象的toString()方法就可以将该java对象转换成字符串的表示形式

		3、那么toString()方法给的默认实现够用吗
*/

public class OverrideTest05 {
	public static void main(String[] args) {
		// 创建一个日期对象
		MyDate t1 = new MyDate();

		// 调用toString()方法（将对象转换成字符串形式）
		// 对这个输出不满意，希望输出xxxx年xx月xx日，这种格式
		// 重写MyDate的toString()方法之前的结果
		//System.out.println(t1.toString()); //chapter13.MyDate@1540e19d

		// 重写MyDate的toString()方法之后的结果
		System.out.println(t1.toString()); //1970年1月1日

		// 大家是否还记得：当输出一个引用的时候，println方法会自动调用引用的toString()方法
		System.out.println(t1);

		MyDate t2 = new MyDate(2008, 8, 8);
		System.out.println(t2.toString());
		System.out.println(t2);

		// 创建学生对象
		Student s1 = new Student(11111, "Jack");
		// 重写toString()方法之前
		//System.out.println(s1); //chapter13.Student@1540e19d
		// 重写toString()方法之后
		// 输出一个学生对象的时候，可能更愿意看到学生的信息，不愿意看到对象的内存地址
		System.out.println(s1);
	}
}

// 日期类
class MyDate{
	private int year;
	private int month;
	private int day;

	public MyDate(){
		this(1970, 1, 1);
	}
	public MyDate(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return this.year + "年" + this.month + "月" + this.day + "日";
	}

	// 从Object类中继承过来的那个toString()方法已经无法满足我的业务需求了
	// 我在子类MyDate中有必要对父类的toString()方法进行覆盖/重写
	// 我的业务要求是：调用toString()方法进行字符串转换的时候
	// 希望转换的结果是：xxxx年xx月xx日，这种格式
}

class Student{
	int no;
	String name;
	public Student(int no, String name){
		this.no = no;
		this.name = name;
	}

	// 重写 方法覆盖
	@Override
	public String toString(){
		return "No: " + this.no + ", Name: " + this.name;
	}
}
