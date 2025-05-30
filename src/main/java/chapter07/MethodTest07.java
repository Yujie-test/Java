package chapter07;

/*
	break语句和return语句有什么区别？
		break;用来终止switch和离他最近的循环
		return;用来终止离他最近的一个方法
*/

// 分析一下代码，编译器会报错吗？
public class MethodTest07 {

	// main方法的返回值类型是void，表示没有返回值
	public static void main(String[] args) {
		// 调用方法
		int res = m();
		System.out.println("result1 = " + res); //1

		// 调用x方法
		int res2 = x(true);
		System.out.println("result2 = " + res2); //1

		// 再次调用x方法
		int res3 = x(false);
		System.out.println("result3 = " + res3); //0
	}

	// 错误：缺少返回语句
	/*public static int m(){
		boolean flag = true; // 编译器不负责运行程序，编译器只讲道理
		// 对于编译器来说，编译器只知道flag变量是boolean类型
		// 编译器会认为flag有可能是false，有可能是true
		if(flag){
			// 编译器觉得：以下这行代码可能会执行，当然也可能不会执行
			// 编译器为了确保程序不出现任何异常，所以编译器说：缺少返回语句
			return 1;
		}
	}*/

	// 怎么修改这个程序
	// 第一种方案：带有else分支的可以保证一定会有一个分支执行
	/*public static int m(){
		boolean flag = true;
		if(flag){
			return 1;
		} else {
			return 0;
		}
	}*/

	// 第二种方案：该方案实际上是方案1的变形
	// return语句一旦执行，所在的方法就会结束
	/*public static int m(){
		boolean flag = true;
		if(flag){
			return 1;
		}
		return 0;
	}*/

	// 在同一个域当中，“return语句”下面不能再编写其他代码，编写之后编译报错
	/*public static int m(){
		boolean flag = true;
		if(flag){
			return 1;
			// 错误：无法访问的语句
			//System.out.println("s1");
		}
		// 这行代码和上面的代码s1区别是不在同一个域当中
		System.out.println("s2");
		return 0;
		// 错误：无法访问的语句
		//System.out.println("s2");
	}*/

	// 三目运算符有的时候会让代码很简单
	public static int m(){
		boolean flag = true;
		return flag ? 1 : 0;
	}

	// 带有一个参数的方法
	public static int x(boolean flag){
		return flag ? 1 : 0;
	}
}

