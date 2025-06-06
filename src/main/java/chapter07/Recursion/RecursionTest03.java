package chapter07.Recursion;

/*
    1、使用递归的方式计算n的阶乘
    2、使用for循环的方式实现一个
*/

public class RecursionTest03 {
    public static void main(String[] args) {
        int res = factorial(3);
        System.out.println(res);

        // 调用标准递归方法
        int r = recursionFactorial(3);
        System.out.println(r);
    }

    // for循环方式
    public static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    // 递归方式
    public static int recursionFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        // 程序能执行到此处说明n不是1
        return n * recursionFactorial(n-1);
    }
}
