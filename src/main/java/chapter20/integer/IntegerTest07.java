package chapter20.integer;

/*
    总结一下之前所学的经典异常：
        空指针异常：NullPointerException
        类型转换异常：ClassCastException
        数组下标越界异常：ArrayIndexOutOfBoundException
        数字格式化异常：NumberFormatException
*/

public class IntegerTest07 {
    public static void main(String[] args) {
        // 手动装箱
        Integer a = new Integer(1000);

        // 手动拆箱
        int b = a.intValue();
        System.out.println(b);

        Integer x = new Integer("123");

        // 编译的时候没问题，一切符合java语法，运行时会不会出现问题呢
        // 不是一个”数字“可以包装成Integer吗？不能，运行时出现异常
        // java.lang.NumberFormatException
        //Integer y = new Integer("zs");

        // 重点方法
        // static int parseInt(String s)
        // 静态方法，传参String，返回int
        // 网页上文本框输入的100实际上是“100”字符串。后台数据库中要求存储100数字，此时java程序需要将“100”转换成100数字
        int retValue = Integer.parseInt("567"); //String --（转换成）--> int
        System.out.println(retValue + 100); //667

        //int retValue = Integer.parseInt("中文"); //NumberFormatException

        // 照葫芦画瓢
        double retValue2 = Double.parseDouble("123.45");
        System.out.println(retValue2 + 1); //124.45

        double retValue3 = Float.parseFloat("123.45");
        System.out.println(retValue3 + 2); //125.44999694824219（精度问题）

        // -------------------------------------以下内容作为了解，不需要掌握----------------------------------------
        // static String toBinaryString(int i)
        // 静态的：将十进制转换成二进制字符串
        String binaryString = Integer.toBinaryString(3);
        System.out.println(binaryString); //"11"二进制字符串

        // static String toHexString(int i)
        // 静态的：将十进制转换成十六进制字符串
        String hexString = Integer.toHexString(16);
        System.out.println(hexString); //"10"十六进制字符串

        // 十六进制：1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a
        String hexString1 = Integer.toHexString(26);
        System.out.println(hexString1); //"1a"十六进制字符串

        System.out.println(new Object()); //java.lang.Object@14ae5a5，@后面是把哈希码值转换成十六进制

        // valueOf方法作为了解
        // static Integer valueOf(int i)
        // 静态的：int --> Integer
        System.out.println(Integer.valueOf(100));

        // static Integer valueOf(String s)
        // 静态的：String --> Integer
        System.out.println(Integer.valueOf("123"));
    }
}
