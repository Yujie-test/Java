package chapter20.random;

/*
    编写程序：生成5个不重复的随机数，重复的话重新生成，最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复
*/

import java.util.Arrays;
import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args){
        int[] arr = RandomNumberGenerator(5, 5);
        // 遍历以上数组
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * 根据用户输入的数组长度和生成的随机数范围生成不重复的随机数，并放在一个数组中
     * @param num 数组长度
     * @param range 生成的随机数范围
     * @return 含有不重复随机数的数组
     */
    public static int[] RandomNumberGenerator(int num, int range){
        // 准备一个长度为num的一维数组
        int[] arr = new int[num]; //默认值都是0

        // 创建Random对象
        Random random = new Random();

        /*for(int i = 0; i < num; i++){
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
        }*/

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        // 循环生成随机数
        int index = 0;
        while (index < arr.length){
            // 生成随机数
            int randomNum = random.nextInt(range);

            // 判断arr数组中有没有这个num
            // 如果没有这个num，就放进去
            if (!ifContains(arr, randomNum)){
                arr[index++] = randomNum;
            }
        }
        return arr;
    }

    /**
     * 单独编写一个方法，这个方法专门用来判断数组中是否包含某个元素
     * @param arr 数组
     * @param num 元素
     * @return true表示包含，false表示不包含
     */
    public static boolean ifContains(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                return true;
            }
        }
        return false;

        // 这个方案有bug（排序出问题了）
        /*// 对数组进行升序
        Arrays.sort(arr);
        // 进行二分法查找
        // 二分法查找的结果>=0说明这个元素找到了，找到了表示存在
        return Arrays.binarySearch(arr, num) >= 0;*/
    }
}
