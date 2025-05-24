package chapter06;
/*
	控制语句：
		选择语句（分支语句）：if语句、switch语句
		循环语句：for循环、while循环、do while循环
		转向语句：break、continue、return
	if语句的语法结构以及运行原理？
		if语句是分支语句，也叫条件语句
		if语句的语法格式：
			if(布尔表达式) {
				java语句;
				java语句;
			}
			这里的一个大括号叫做一个分支
			if这个单词翻译为如果，所以又叫条件语句
			该语法的执行原理是：
				如果布尔表达式的结果为true，则执行大括号中的程序，否则大括号中代码不执行

		第二种写法：
			if(布尔表达式) { // 分支1
				java语句;
			}else{        // 分支2
				java语句;
			}
			执行原理：如果布尔表达式的结果为true，则执行分支1，分支2不执行。
				    如果布尔表达式的结果为false，分支1不执行，执行分支2.
				    以上的这个语句可以保证一定会有一个分支执行。else表示其他
		第三种写法：
			if(布尔表达式1) {             // 分支1
				java语句;
			}else if(布尔表达式2){        // 分支2
				java语句;
			}else if(布尔表达式3){        // 分支3
				java语句;
			}else if(布尔表达式4){        // 分支4
				java语句;
			}...
			执行原理：
				先判断布尔表达式1，如果布尔表达式1为true，则执行分支1，然后if语句就结束了
				当布尔表达式1的结果为false，那么会继续判断布尔表达式2的结果，如果布尔表达式2为true，则执行分支2，然后if语句就结束了
				从上往下依次判断，主要看第一个true发生在哪个分支上。第一个true对应的分支执行，只要有一个分支执行，整个if结束
		第四种写法：
			if(布尔表达式1) {             // 分支1
				java语句;
			}else if(布尔表达式2){        // 分支2
				java语句;
			}else if(布尔表达式3){        // 分支3
				java语句;
			}else if(布尔表达式4){        // 分支4
				java语句;
			}else{                      // 分支5
				java语句;                // 以上条件没有一个成立的，这个else就执行了
			}
			执行原理：
				先判断布尔表达式1，如果布尔表达式1为true，则执行分支1，然后if语句就结束了
				当布尔表达式1的结果为false，那么会继续判断布尔表达式2的结果，如果布尔表达式2为true，则执行分支2，然后if语句就结束了
				从上往下依次判断，主要看第一个true发生在哪个分支上。第一个true对应的分支执行，只要有一个分支执行，整个if结束

		注意：
			1、对于if语句来说，在任何情况下只能有1个分支执行，不可能存在2个或者更多个分支执行。if语句只要有一个分支执行了，整个if语句就结束了
			2、以上4种语法机制中，凡是带有else分支的，一定可以保证会有一个分支执行。
			3、当分支当中“java语句;”只有一条，那么大括号可以省略，但为了可读性，最好不要省略。
			4、控制语句和控制语句之间是可以嵌套的，但是嵌套的时候大家最好是一个语句一个语句进行分析，不要冗杂在一起分析
*/
public class IfTest01 {
	public static void main(String[] args){
		// 定义一个布尔类型的变量，表示性别
		boolean sex = true;
		// 业务：当sex为true时表示男，为false时表示女
/*		if(sex == true){ // == 是关系运算符，不是赋值运算符，== 双等号是用来判断是否相等
			System.out.println("Male");
		}else {
			System.out.println("Female");
		}*/
		// 改良
		if(sex){
			System.out.println("male");
		}else {
			System.out.println("female");
		}
		// 可以再进一步改良
		// 可以使用三目运算符
		sex = false;
		System.out.println(sex ? "male" : "female");

		// 代码可以这样写吗
		// () 小括号当中最终取的值是sex变量的值
		// 而sex是布尔类型，所以这个可以通过
		if(sex = true){ // 以前sex不管是true还是false，走到这一行，sex一定是true
			System.out.println("Male"); // 输出“Male”
		}else {
			// 虽然这种语法可以，但会导致else分支永远不能执行
			System.out.println("Female");
		}

		int i = 100;
		if (i == 100){
			System.out.println("i = 100");
		}
		// 错误：不兼容的类型，int无法转换为boolean
		/*if (i = 100){ // (i = 100)整体执行完之后是一个int类型，不是布尔类型
			System.out.println("i = 100");
		}*/

		// 当分支中只有一条java语句的话，大括号可以省略
		if(sex)
			System.out.println("male");
		else
			System.out.println("female");

		// 判断以下程序会出现问题吗？会出什么问题？第几行代码报错
		/*if (sex)
			System.out.println("Male");
		    System.out.println("Hello World"); // 以上这三行代码没有问题，合乎语法
		else // 这一行编译报错，因为else缺少if
		    System.out.println("Female");*/

	}
}

