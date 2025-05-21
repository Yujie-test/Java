package day03;
import java.util.Scanner;
public class KeyInput2 {
	public static void main(String[] args){
		// 创建键盘扫描器对象
		Scanner s = new Scanner(System.in);

		System.out.println("欢迎使用小型迷你计算器");
		System.out.print("请输入第一个数字：");
		int num1 = s.nextInt();
		System.out.print("请输入第二个数字：");
		int num2 = s.nextInt();
		System.out.println("结果:" + (num1+num2));
	}
}

