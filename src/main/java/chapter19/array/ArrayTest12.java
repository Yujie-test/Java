package chapter19.array;

/*
    动态初始化二维数组
*/

public class ArrayTest12 {
    public static void main(String[] args) {
        // 3行4列
        // 3个一维数组，每一个一维数组当中4个元素
       int[][] a = new int[3][4];

        for (int i = 0; i < a.length; i++) { // 循环3次
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("第" + (i+1) + "个一维数组中的第" + (j+1) + "个元素" + a[i][j] + " ");
            }
            System.out.println();
        }

        int[][] array = {{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 4, 5, 6}};
        printArray(array);

        // 可以这样写
        printArray(new int[][] {{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 4, 5, 6}});
    }

    public static void printArray(int[][] a){
        // 遍历二维数组
        for (int i = 0; i < a.length; i++) { // 循环3次
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
