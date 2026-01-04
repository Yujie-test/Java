/*
    冒泡排序算法
        1、每一次循环结束之后，都要找出最大的数据，放到参与比较的这堆数据的最右边（冒出最大的那个气泡
        2、核心：拿着左边的数字和右边的数字比对，当左边 > 右边的时候，交换位置

        原始数据：3, 2, 7, 6, 8
        第一次循环：
            拿着3和右边相邻的2进行比较，如果左边大于右边交换位置，交换位置之后的数据：2, 3, 7, 6, 8
            2, 3, 7, 6, 8（虽然不需要交换位置，但是3和7还是需要比较一次）
            2, 3, 6, 7, 8（7和6交换位置）
            2, 3, 6, 7, 8
        经过第一次循环，参与比较的数据：2, 3, 6, 7

        第二次循环：
            2, 3, 6, 7（2和3比较，不需要交换位置）
            2, 3, 6, 7（3和6比较，不需要交换位置）
            2, 3, 6, 7（6和7比较，不需要交换位置）
        经过第二次循环，参与比较的数据：2, 3, 6

        第三次循环：
            2, 3, 6（2和3比较，不需要交换位置）
            2, 3, 6（3和6比较，不需要交换位置）
        经过第三次循环，参与比较的数据：2, 3

        第四次循环：
            2, 3, 6（2和3比较，不需要交换位置）
        排序结束
*/

package chapter19.array;public class BubbleSort {
    public static void main(String[] args) {
        // 这是int类型的数组对象
        int[] arr = {9, 8, 10, 7, 6, 0, 11};

        // 7条数据循环6次
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            System.out.print("第" + (i+1) + "次循环：");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        int count = 0;
        int[] arr2 = {9, 8, 10, 7, 6, 0, 11};
        // 7条数据循环6次（冒泡排序的外层循环采用这种方式）
        for (int i = arr2.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                // 不管是否需要交换位置，总之是要比较一次
                count++;
                if (arr2[j] > arr2[j+1]){
                    // 交换位置
                    // arr2[j]和arr2[j+1]交换位置
                    int tmp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = tmp;
                }
            }
        }

        // 输出结果
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
        System.out.println("比较次数：" + count);

    }
}
