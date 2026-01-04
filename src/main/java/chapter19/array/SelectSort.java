package chapter19.array;

/*
    选择排序（比冒泡排序的效率高，高在交换位置的次数上）：
        每一次从这堆参与比较的数据当中找到最小值
        拿着这个最小值和参与比较的这堆最前面的元素交换位置

        选择排序比冒泡排序好在：每一次的交换位置都是有意义的

        关键点：选择排序的关键在于，你怎么找出一堆数据中最小的
        原始数据：3, 2, 7, 6, 8
            假设：
                第一个3是最小的
                3和2比较，发现2更小，所以此时最小的是2

                继续拿着2往下比对，2和7比较，2仍然是最小的
                继续拿着2往下比对，2和6比较，2仍然是最小的
                继续拿着2往下比对，2和8比较，2仍然是最小的，所以2就是最小的

                拿着2和最左边的3交换位置
*/

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 10, 7, 6, 0, 11};
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minValue = arr[i];
            int pointer = i;

            for (int j = i+1; j < arr.length; j++) {
                count3++;
                if (arr[j] < minValue){
                    minValue = arr[j];
                    pointer = j;
                }
            }

            count4++;
            arr[pointer] = arr[i];
            arr[i] = minValue;

            System.out.print("第" + (i+1) + "次循环：");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
        System.out.println("比较次数：" + count3); // 15
        System.out.println("交换位置次数：" + count4); // 6

        System.out.println("============================================");

        int[] arr2 = {9, 8, 10, 7, 6, 0, 11};
        int count = 0;
        int count2 = 0;
        // 选择排序
        // 7条数据循环6次（外层循环6次）
        for (int i = 0; i < arr2.length - 1; i++) {
            // i的值是0 1 2 3 4 5 6
            // i正好是“参加比较的这堆数据中“最左边那个元素的下标
            // i是一个参与比较的这堆数据中的起点下标
            // 假设起点i下标位置上的元素是最小的
            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                count++;
                if (arr2[j] < arr2[min]){
                    min = j; // 最小值的元素下标是j
                }
            }

            // 只有当i和min相等时，表示最初猜测是对的
            // 当i和min不相等时，表示最初猜测是错的，有比这个元素更小的元素
            // 需要拿着这个更小的元素和最左边的元素交换位置
            if (i != min){
                count2++;
                // 表示存在更小的数据
                // arr2[min] 最小的数据
                // arr2[i] 最前面的数据
                int tmp = arr2[i];
                arr2[i] = arr2[min];
                arr2[min] = tmp;
            }

            // 排序之后遍历
            System.out.print("第" + (i+1) + "次循环：");
            for (int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[j] + " ");
            }
            System.out.println();
        }

        // 冒泡排序和选择排序实际上比较的次数没有变
        // 交换位置次数减少了
        System.out.println("比较次数：" + count); // 21
        System.out.println("交换位置次数：" + count2); // 5
    }
}
