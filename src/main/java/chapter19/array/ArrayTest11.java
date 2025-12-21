package chapter19.array;

/*
    二维数组的遍历
*/

public class ArrayTest11 {
    public static void main(String[] args) {
        String[][] array = {
                {"java", "oracle", "c++", "python", "c#"},
                {"Jack", "Lucy", "Mary"},
                {"abc", "def", "ghi"}
        };

        // 遍历二维数组
        for (int i = 0; i < array.length; i++) { // 外层循环3次（负责纵向）
            // 内层循环负责输出一行
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            // 输出换行符
            System.out.println();
        }
    }
}
