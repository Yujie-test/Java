package chapter09.hard;

/*
*/

public class User {
	// 类=属性+方法
	// 以下3个都是属性，都是实例变量（对象变量）

	// 用户名id
	// int是一种基本数据类型
	int id; // 实例变量

	// 用户名
	// String是一种引用数据类型
	String name; // 实例变量

	// 家庭住址
	// Address是一种引用数据类型
	// addr是成员变量
	// addr是否是一个引用呢？ 是
	Address addr; // 实例变量
}

// 实例变量都在堆内存的对象内部
// 方法体外，类体内定义的变量叫做成员变量

