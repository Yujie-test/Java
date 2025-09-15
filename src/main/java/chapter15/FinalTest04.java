package chapter15;
/*
    上一个例子结论：
        final修饰的实例变量，必须手动赋值。final修饰的变量只能赋值一次。
    final修饰的实例变量一般添加static修饰

    结论：
        static final联合修饰的变量称之为“常量”
        常量名建议全部大写，每个单词之间采用下划线衔接

    常量：实际上常量和静态变量一样，区别在于：
        常量的值不能变

        常量和静态变量都是存储在方法区，并且都是在类加载时初始化。

        常量一般都是公共的：public的。因为改不了
*/
public class FinalTest04 {
    public static void main(String[] args) {

        System.out.println(Chinese.COUNTRY);
        // 错误：无法为最终变量COUNTRY分配值
        //Chinese.COUNTRY = "America";
    }
}

class Chinese{
    // 身份证号，每个人都不一样，对象级别的
    String idCard;
    // 姓名，对象不同姓名不一样
    String name;
    // 国家的值是一个固定值：“中国”
    // 实例变量在堆中，一个对象一份，100个对象100份
    // 实例变量既然使用final修饰了，说明实例变量值不会随着对象的变化而变化
    // 该实例变量前面应该添加：static关键字，变为静态的，存储在方法区
    //final String country = "China";
    final static String COUNTRY = "China";
}

class Math{
    // 数学中的pi是永远不会改变的
    public static final double PI = 3.1415926;
}