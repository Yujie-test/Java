package chapter19.array;

/*
    关于java中的二维数组
        1、二维数组其实是一个特殊的一维数组，特殊在这个一维数组当中的每一个元素是一个一维数组
        2、三维数组是什么？
            三维数组是一个特殊的二维数组，特殊在，这个二维数组中每个元素是一个一维数组
            实际的开发中使用最多的就是一维数组。二维数组也很少使用。三维数组几乎不用
        3、二维数组静态初始化
            int[][] a = {{100, 200, 300}, {30, 20, 40, 50, 60}, {6, 7, 9, 1}, {0}};
*/

public class ArrayTest09 {
    public static void main(String[] args) {
        // 一维数组
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        System.out.println(array1.length);

        // 二维数组
        // 里面是多个一维数组
        int[][] array = {
                array1,
                array2
        };
        int[][] a = {
                {100, 200, 300},
                {30, 20, 40, 50, 60},
                {6, 7, 9, 1},
                {0}
        };
        System.out.println(array.length); //2
        System.out.println(a.length); //4
        System.out.println(a[0].length); //3
        System.out.println(a[1].length); //5
        System.out.println(a[2].length); //4
        System.out.println(a[3].length); //1

        // 三维数组
        int[][][] a3 = {
                {{100, 200, 300}, {10, 20, 30}},
                {{30, 20, 40, 50, 60}, {6, 7, 9, 1}, {0}}
        };
        System.out.println(a3.length); //2
        System.out.println(a3[1][1].length); //4
    }
}
