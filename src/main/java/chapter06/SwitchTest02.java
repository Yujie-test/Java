package chapter06;

/*
	业务要求：
		1、系统接收一个学生的考试成绩，根据考试成绩输出成绩的等级
		2、等级：
			优：[90-100]
			良：[80-90)
			中：[70-80)
			及格：[60-70)
			不及格：[0-60)
		3、要求成绩是一个合法的数字，成绩必须在[0-100]之间，成绩可能有小数

		必须使用switch来完成，你该怎么办？
*/
public class SwitchTest02 {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入学生成绩：");
		double score = s.nextDouble();
		if (score < 0 || score > 100) {
			System.out.println("您输入的学生成绩不合法，再见！");
			return; // 这个代码的执行，会让main结束
		}

		// 程序能够执行到这里说明成绩一定是合法的。
		// grade的值可能是：0， 1， 2， 3， 4， 5， 6， 7， 8， 9， 10
		// 不及格：0， 1， 2， 3， 4， 5
		// 及格：6
		// 中：7
		// 良：8
		// 优：9，10
		int grade = (int)(score / 10); // 95.5/10 结果9.55，强转为int结果是9
		String str = "不及格";
		switch (grade) {
			case 9: case 10:
				str = "优";
				break;
			case 8:
				str = "良";
				break;
			case 7:
				str = "中";
				break;
			case 6:
				str = "及格";
				break;
		}
		System.out.println("该学生的成绩等级为：" + str);
	}
}

