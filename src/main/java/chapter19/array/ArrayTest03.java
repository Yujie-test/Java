package chapter19.array;

/*
    当一个方法上，参数的类型是一个数组的时候，应该如何传参。
 */

public class ArrayTest03 {
    // main方法的编写方式，还可以采用C++的语法格式
    public static void main(String args[]) {
        System.out.println("Hello World!");

        int[] a1 = {1, 2, 3};
        for (int i = 0; i < a1.length; i++){
            System.out.println(a1[i]);
        }

        // C++的写法，不建议
        int a2[] = {2, 3, 4};
        for (int i = 0; i < a2.length; i++){
            System.out.println(a2[i]);
        }

        System.out.println("==============================");

        // 调用方法时传一个数组
        printArray(a1);

        // 创建String数组
        String[] strs = {"abc", "def", "ghi", "jkl"};
        printArray(strs);

        String[] s = new String[10];
        printArray(s); // 10个null

        System.out.println("====================================");
        printArray(new String[4]);

        System.out.println("====================================");
        printArray(new int[3]);
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
