package chapter18;

/*
    hashCode()方法：
        在Object中的hashCode()方法是怎么样的？
            public native int hashCode();

            这个方法不是抽象方法，带有native关键字，底层调用C++程序

        hashCode()方法返回的是哈希码：
            实际上就是一个java对象的内存地址，经过哈希算法，得出一个值
            所以hashCode()方法的执行结果可以等同看作一个java对象的内存地址
*/

public class Test07 {
    public static void main(String[] args) {
        Object o = new Object();
        int hashCodeValue = o.hashCode();

        // 对象内存地址经过哈希算法转换的一个数字，可以等同看作内存地址
        System.out.println(hashCodeValue); // 356573597

        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        System.out.println(mc1.hashCode()); // 1735600054
        System.out.println(mc2.hashCode()); // 21685669
    }
}

class MyClass{

}
