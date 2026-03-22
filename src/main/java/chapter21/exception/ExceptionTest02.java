package chapter21.exception;

/*
    java语言中，异常是以什么形式存在的呢？
        1、异常在java中以类的形式存在，每一个异常类都可以创建异常对象
        2、异常对应的现实生活中是怎样的？
            火灾（异常类）：
                2008年8月8日，小明家着火了
                2008年8月8日，小刚家着火了
                2008年8月8日，小红家着火了

            类：模版
            对象：实际存在的个体

            钱包丢了（异常类）：
                2008年8月8日，小明的钱包丢了（异常对象）
                2008年8月8日，小芳的钱包丢了（异常对象）
                ......
*/

public class ExceptionTest02 {
    public static void main(String[] args) {
        // 通过“异常类”实例化“异常对象”
        NumberFormatException nfe = new NumberFormatException("数字格式化异常");
        System.out.println(nfe); //java.lang.NumberFormatException: 数字格式化异常

        // 通过“异常类”实例化“异常对象”
        NullPointerException npe = new NullPointerException("空指针异常发生了");
        System.out.println(npe); //java.lang.NullPointerException: 空指针异常发生了
    }
}
