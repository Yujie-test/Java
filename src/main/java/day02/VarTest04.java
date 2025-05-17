package day02;/*
	关于变量的分类：
		根据变量声明的位置来分类
			* 局部变量
				- 在方法体当中声明的变量叫做局部变量
			* 成员变量
				- 在方法体外「类体之内」声明的变量叫做成员变量
	在不同的作用域当中，变量名是可以相同的
*/

public class VarTest04{

	//成员变量
	int k = 200;

	//主方法：入口
	public static void main(String[] args){

		//i变量就是局部变量
		int i = 10;

		//java遵循“就近原则”
		System.out.println(i);
	}

	//成员变量
	int i = 100; //声明变量

	//类体中不能直接编写java语句「除声明变量之外」
	//System.out.println(i);

	//doSome方法
	public static void doSome(String[] args){

		//局部变量
		int i = 10;
	}
}