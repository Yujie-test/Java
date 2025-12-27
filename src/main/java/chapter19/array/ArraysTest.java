package chapter19.array;

/*
    使用一下SUN公司提供的数组工具类：java.util.Arrays;
*/

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        // 工具类当中的方法大部分都是静态的
        int[] array = {1, 6, 3, 5};
        Arrays.sort(array);

        // 遍历输出
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
