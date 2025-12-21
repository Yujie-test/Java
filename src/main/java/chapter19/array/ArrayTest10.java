package chapter19.array;

/*
    关于二维数组中元素的：读和写
        a[二维数组中的一维数组的下标][一维数组的下标]
        a[0][0]: 表示第一个一维数组中的第一个元素
        a[3][100]: 表示第四个一维数组中的第101个元素

        注意：对于a[3][100]来说，其中a[3]是一个整体。[100]是前面a[3]执行结束的结果然后再下标100
*/

public class ArrayTest10 {
    public static void main(String[] args) {
        // 二维数组
        int[][] a = {
                {34, 4, 65},
                {100, 200, 3900, 111},
                {0}
        };

        // 请取出以上二维数组中的第一个一维数组
        int[] 我是第一个一维数组 = a[0];
        int 我是第一个一维数组中的第一个元素 = 我是第一个一维数组[0];
        System.out.println(我是第一个一维数组中的第一个元素);

        // 合并以上代码
        // 以下代码的由来是由于以上代码的合并导致的
        System.out.println(a[0][0]);

        // 取出第二个一维数组中的第三个元素
        System.out.println(a[1][2]);

        // 改
        a[2][0] = 11111;

        // 注意别越界
        // java.lang.ArrayIndexOutOfBoundsException
        //System.out.println(a[2][1]);

        for (int i = 0; i < a[0].length; i++) {
            System.out.println(a[0][i]);
        }
    }
}
