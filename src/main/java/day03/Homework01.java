package day03;
public class Homework01 {
	public static void main(String[] args){
		int i = 10;
		i = i ++;
		// 没有研究的意义，C++中结果是11，Java中是10
		// 因为两个编译器是不同的人开发的，原理不同
		System.out.println(i); // 10

		// 在java语言中这种表达式在执行的时候，会提前先将i变量找一个临时变量存储一下（C++中没有这么做）
		int k = 10;
		// k = k ++;对应以下这三行代码
		int temp = k;
		k++;
		k = temp;
		System.out.println(k);

	}
}

