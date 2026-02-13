package chapter19.array;

/*
    1、数据工具类：自己写的，不是SUN的
    2、关于查找算法中的：二分法查找
        10（下标0） 11 12 13 14 15 16 17 18 19 20（下标10） arr数组

        通过二分法查找，找到18这个元素的位置
            (0 + 10) / 2 --> 中间元素的下标：5

        拿着中间这个元素和目标要查找的元素进行对比
            中间元素是arr[5] --> 15
            15 < 18（被查找的元素）
            被查找的元素18在目前中间元素15的右边
            所以开始元素的下标从0变成5+1

        再重新计算一个中间元素的下标：
            开始下标是：5+1 = 6
            结束下标是：10
            (6 + 10) / 2 --> 中间元素的下标：8

        8下标对应的元素arr[8] --> 18
            找到的中间元素正好和被找的元素相等

        二分法查找的终止条件：一直折半，直到中间的那个元素恰好是被查找的元素

3、二分法查找算法是基于排序的基础之上（没有排序的数据是无法查找的）
 */

public class ArrayUtil {
    public static void main(String[] args) {
        int[] a = {10, 23, 56, 89, 100, 111, 222, 235, 500, 600};

        // 找出arr这个数组中222所在的下标
        // 调用方法
        int key = binarySearch2(a, 222);
        System.out.println(key);
    }

    /**
     * 从数组中查找目标元素的下标
     * @param arr 被查找的数组（这个必须是已经排序的）
     * @param key 目标元素
     * @return -1表示该元素不存在，其他表示返回该元素的下标
     */

    public static int binarySearch2(int[] arr, int key) {
        // 开始下标
        int start = 0;
        // 结束下标
        int end = arr.length - 1;
        // 中间元素下标
        int pointer;
        while (start <= end) {
            pointer = (start + end) / 2;
            if (arr[pointer] == key){
                return pointer;
            } else if (arr[pointer] > key) {
                end = pointer - 1;
            } else {
                start = pointer + 1;
            }
        }
        return -1;
    }
}
