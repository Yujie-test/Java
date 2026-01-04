package chapter19.array;

/*
    选择排序（比冒泡排序的效率高，高在交换位置的次数上）：
        每一次从这堆参与比较的数据当中找到最小值
        拿着这个最小值和参与比较的这堆最前面的元素交换位置

        原始数据：3, 2, 7, 6, 8
*/

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 10, 7, 6, 0, 11};
        // 选择排序
        // 7条数据循环6次（外层循环6次）
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = arr[i];
            int pointer = i;
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[j] < minValue){
                    minValue = arr[j];
                    pointer = j;
                }
            }

            arr[pointer] = arr[i];
            arr[i] = minValue;

            System.out.print("第" + (i+1) + "次循环：");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
