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
*/
public class IfTest03 {
	public static void main(String[] args) {
		// 键盘扫描器对象
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("请输入成绩：");
		// 考试成绩带有小数
		float score = s.nextFloat(); // 程序到这里停下了，等待用户的输入
		// 判断考试成绩
		String str = "不及格";
		if (score < 0 || score > 100){
			str = "请检查您的输入";
		} else if (score >= 90) {
			str = "优";
		} else if (score >= 80) {
			str = "良";
		} else if (score >= 70) {
			str = "中";
		} else if (score >= 60) {
			str = "及格";
		}
		System.out.println(str);
	}
}

