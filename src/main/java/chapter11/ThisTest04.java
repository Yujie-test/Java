package chapter11;

/*
	1、this除了可以使用在实例方法中，还可以用在构造方法中。
	2、新语法：通过当前的构造方法取调用另一个本类的构造方法，可以使用以下语法格式：
		this(实际参数列表);
			通过一个构造方法1去调用构造方法2，可以做到代码复用
			但需要注意的是：“构造方法1”和“构造方法2”都是在同一个类中。
	3、"this(实际参数列表);" 这个语法的作用是代码复用
	4、注意：对于this()的调用只能出现在构造方法的第一行
*/

public class ThisTest04 {

	public static void main(String[] args) {
		// 调用无参数构造方法
		Date d1 = new Date();
		d1.detail();

		Date d2 = new Date(2025, 6, 22);
		d2.detail();
	}
}

/*
	需求：
		1、定义一个日期类，可以表示年月日信息
		2、需求中要求：
			如果调用无参数构造方法，默认创建的日期为：1970年1月1日
			同时也可以调用有参数的构造方法来创建日期对象
*/

class Date{
	private int year;
	private int month;
	private int day;

	// 无参数构造方法
	// 调用无参数构造方法，初始化的日期是固定值
	public Date(){
		// 错误：对this的调用必须是构造器中的第一个语句
		//System.out.println('a');
		/*year = 1970;
		month = 1;
		day = 1;*/
		this(1970, 1, 1);
	}
	// 有参构造方法
	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// getter and setter方法
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public void detail(){
		System.out.println("Year = " + year + ", Month = " + month + ", Day = " + day);
	}
}

