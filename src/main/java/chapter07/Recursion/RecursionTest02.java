package chapter07.Recursion;

/*

*/

// 先不使用递归，计算1-n的和
// 使用递归，计算1-n的和
public class RecursionTest02 {
    public static void main(String[] args) {
        int res = sum(10);
        System.out.println(res);

        recursionSum2(1, 10, 0);
        System.out.println("----------------------------------------------------");

        // 调用标准递归方法
        int r = recursionSum(10);
        System.out.println(r);

    }

    // for循环方式
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 递归方式——自己写的
    public static void recursionSum2(int i, int n, int sum) {
        sum += i;
        if (i == n) {
            System.out.println(sum);
            return;
        }
        recursionSum2(++i, n, sum);
    }

    // 递归方式
    public static int recursionSum(int n) {
        if (n == 1) {
            return 1;
        }
        // 程序能执行到此处说明n不是1
        return n + recursionSum(n-1);
    }

}
