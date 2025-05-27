package chapter06;

/*
	九九乘法表
*/
public class ForTest06 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j <= i){
					System.out.print(j + "*" + i + "=" + (i * j) + " ");
				}
			}
			System.out.println();
		}
	}
}

