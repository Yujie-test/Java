package chapter07;

/*
*/

public class Test {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {
            int temp = i % 5;
            for (int j = 1; j <= 9; j++) {
                if (i >= 5){
                    if (j <= temp){
                        System.out.print(" ");
                    } else if (j > 9 - temp) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if (j <= 5 - temp){
                        System.out.print(" ");
                    } else if (j > 4 + temp) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
