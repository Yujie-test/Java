package chapter11;

/*
	什么时候变量声明为实例的，什么时候声明为静态的
*/

public class StaticTest02 {

	public static void main(String[] args) {

	}
}

// 定义一个类：中国人
class Chinese{
	// 身份证号
	// 每个人的身份证号不同，所以身份证号应该是实例变量，一个对象一份
	String idCard;

	// 姓名
	// 姓名也是一个人一个姓名，姓名也应该是实例变量
	String name;

	// 国籍
	// 对于“中国人”这个类来说，国籍都是“中国”，不会随着对象的改变而改变
	// 显然国籍并不是对象级别的特征
	// 国籍属于整个类的特征。整个族的特征
	// 假设声明为实例变量，内存图是怎么样的
	// 假设声明为静态变量，内存图又是怎样的
	String country;

}

