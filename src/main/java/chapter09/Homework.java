package chapter09;

/*
	丈夫类：身份证号，姓名，出生日期，妻子
	妻子类：身份证号，姓名，出生日期，丈夫
	关联妻子和丈夫
*/

public class Homework {
	public static void main(String[] args) {
		Husband h = new Husband("120107195706042164", "陈洪都", "1957-06-04", "120107195705042158");
		Wife w = new Wife("120107195705042158", "解曼莹", "1957-05-04", "120107195706042164");

		System.out.println(h.name + "的妻子是" + h.wifeID);


	}
}

class Husband {
	String personalID;
	String name;
	String birthday;
	String wifeID;

	public Husband(){

	}

	public Husband(String id, String xingMing, String shengRi, String wID){
		personalID = id;
		name = xingMing;
		birthday = shengRi;
		wifeID = wID;
	}

}

class Wife {
	String personalID;
	String name;
	String birthday;
	String husbandID;

	public Wife(){

	}

	public Wife(String id, String xingMing, String shengRi, String hID){
		personalID = id;
		name = xingMing;
		birthday = shengRi;
		husbandID = hID;
	}

}

