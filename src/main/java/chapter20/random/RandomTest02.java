package chapter20.random;

/*
    编写程序：生成5个不重复的随机数，重复的话重新生成，最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复
*/

import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args){
        int[] arr = RandomNumberGenerator(5, 5);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] RandomNumberGenerator(int num, int range){
        int[] arr = new int[num];
        Random random = new Random();
        for(int i = 0; i < num; i++){
            int randomNum = random.nextInt(range);
            boolean flag = true;
            for (int j = 0; j < i; j++) { //j=0, 0
                if (arr[j] == randomNum) {
                    i -= 1;
                    flag = false;
                    break;
                }
            }
            if (flag){
                arr[i] = randomNum;
            }
        }
        return arr;
    }
}
