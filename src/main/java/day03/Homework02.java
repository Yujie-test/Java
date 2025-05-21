package day03;
public class Homework02 {
	public static void main(String[] args){
		int x = 10;
		int a = x + x++; // 该行代码只要结束，x就是11
		/*
			int a = x + x++; 相当于以下两行代码：
				int temp = x++; // 先赋值，再自加一
				int a = x + temp;
		*/
		System.out.println(a); // 20
		System.out.println(x); // 11

		int b = x + ++x;
		System.out.println(b); // 23
		System.out.println(x); // 12

		int c = x + x--;
		System.out.println(c); // 24
		System.out.println(x); // 11

		int d = x + --x;
		System.out.println(d); // 21
		System.out.println(x); // 10
	}
}

