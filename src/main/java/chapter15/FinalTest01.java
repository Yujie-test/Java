package chapter15;
/*
    final
        1、final是java语言中的一个关键字
        2、final表示：
            最终的，不可变的

        3、final修饰的变量？
            final修饰的局部变量一旦赋值，不允许重新赋值；final修饰的变量，只能赋值一次

        4、final修饰的方法？
            final修饰的方法无法被覆盖、被重写

        5、final修饰的类？
            final修饰的类无法继承

        6、final控制不了能不能调用的问题，final修饰的表示最后的，不能变的，不能改的
*/
public class FinalTest01 {
    public static void main(String[] args) {

        // 局部变量
        int i = 100;
        // 重新赋值
        i = 200;

        // 局部变量
        final int k = 100;
        // 重新赋值
        // 错误：无法为最终变量k分配值
        //k = 200;

        // 局部变量
        final int m;
        // 第一次赋值
        m = 100;
        // 重新赋值
        // 错误：可能已分配变量m
        //m = 200;


        // 多态
        C c = new D();
        //c.doOther(); // 报错了，因为编译器报错，编译器认为c是C类，C类中没有doOther()方法

        // 调用子类中特有的方法时，需要向下转型
        if (c instanceof D){ // c指向的对象如果确实是D类型
            D d = (D)c;
            d.doOther();
        }
    }
}

final class A{ // A没有子孙
}

// B类继承A类，相当于对A类的功能进行扩展。如果你不希望别人对A类型进行扩展
// 你可以给A类加final关键字，这样的话A类就无法继承了
// 错误：Cannot inherit from final 'chapter15.A'
/*
class B extends A{
}
*/

// 错误：Cannot inherit from final 'java.lang.String'
/*
class MyString extends String{
}
*/

class C{
    public final void doSome(){
        System.out.println("C's doSome method");
    }
}

class D extends C{
    // 错误：'doSome()' cannot override 'doSome()' in 'chapter15.C'; overridden method is final
    /*
    public void doSome(){
        System.out.println("D's doSome method");
    }
    */

    public void doOther(){
        System.out.println("D's doOther method!");
    }
}
