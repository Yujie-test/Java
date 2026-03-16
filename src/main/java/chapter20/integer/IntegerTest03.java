package chapter20.integer;

/*
    关于Integer类的构造方法，有两个：
        Integer(int)
        Integer(String)
 */

public class IntegerTest03 {
    public static void main(String[] args) {
        // Java9之后不建议使用这个构造方法了，出现横线表示已过时
        // 将数字123转换成Integer包装类型（int --> Integer）
        Integer x = new Integer(123);
        System.out.println(x);

        // 将String类型的数字，转换成Integer包装类型（String --> Integer）
        Integer y = new Integer("100");
        System.out.println(y);

        // String --> Double
        Double d = new Double("3.14");

        // double --> Double
        Double e = new Double(3.14);
    }
}
