package day03;/*
	关于8种基本数据类型的默认值
		    基本数据类型                 默认值
			----------------------------------------------
			byte,short,int,long        0                       
			float,double               0.0
			boolean                    false「在c语言中，true是1，false是0」
			char                       \u000a
	八种数据类型的默认值是一切向0看齐
*/

public class DataTypeTest02{

	//这里的static必加
	static int k = 1000;

	//成员变量没有手动赋值系统会默认赋值「局部变量不会」
	static int f; //成员变量

	public static void main(String[] args){

		/*
		int i;  //局部变量
		System.out.println(i);
		*/

		System.out.println(k);

		System.out.println(f); // 0
	}
}