package chapter15;
/*
    final修饰的实例变量呢？
        final修饰的变量只能赋值一次

    实例变量如果没有手动赋值的话，系统会赋默认值

    实例变量在什么时候赋值（初始化）
        构造方法执行的过程中赋值（new的时候赋值）

    结论：
        final修饰的实例变量，系统不负责赋默认值，要求程序员必须手动赋值。
        这个手动赋值，在变量后面赋值可以，在构造方法中赋值也可以。

*/
public class FinalTest03 {
    public static void main(String[] args) {
        User u = new User(50.2);
    }
}

class User{
    // 实例变量
    // 错误：变量 age 未在默认构造器中初始化
    //final int age;

    // 实例变量
    final int height = 180;


    // 以下这些代码全部联合起来，weight变量也是赋值了一次
    // 实例变量
    final double weight;

    // 构造方法
    /*public User() {
        System.out.println('a');
        weight = 80;  // 只要我赶在系统赋默认值之前赋值就行
        // 系统赋默认值是这个时候
        //weight = 0.0;
        //weight = 90; // 这个不行
    }*/

    public User(double w) {
        // 这也是赋值了，没有采用系统默认值
        weight = w;
    }
}
