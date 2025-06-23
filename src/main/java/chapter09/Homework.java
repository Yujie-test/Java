package chapter09;

/*
	丈夫类：身份证号，姓名，出生日期，妻子
	妻子类：身份证号，姓名，出生日期，丈夫
	关联妻子和丈夫
	输出“丈夫对象”的妻子姓名和“妻子对象”的丈夫姓名
*/

public class Homework {
	public static void main(String[] args) {
		// 创建丈夫对象
		Husband h = new Husband("111111111111111111", "CHD", "1957-06-04");
		// 创建妻子对象
		Wife w = new Wife("222222222222222222", "XMY", "1957-05-04");

		// 关联妻子和丈夫对象
		h.wife = w;
		w.husband = h;

		// 输出“丈夫对象”的妻子姓名
		System.out.println(w.name + "的丈夫的名字是：" + w.husband.name);
		// 输出“妻子对象”的丈夫姓名
		System.out.println(h.name + "的妻子的名字是：" + h.wife.name);
	}
}

class Husband {
	String personalID;
	String name;
	String birthday;
	Wife wife;

	public Husband(){

	}

	public Husband(String personalID, String name, String birthday){
		this.personalID = personalID;
		this.name = name;
		this.birthday = birthday;
	}

}

class Wife {
	String personalID;
	String name;
	String birthday;
	Husband husband;

	public Wife(){

	}

	public Wife(String personalID, String name, String birthday){
		this.personalID = personalID;
		this.name = name;
		this.birthday = birthday;
	}
}

