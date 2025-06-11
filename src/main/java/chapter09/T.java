package chapter09;

// 画内存图，按照程序执行顺序画

public class T {
    A a; // 成员变量中的实例变量，必须先创建对象，通过“引用“来访问
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        T t = new T();

        // 这里不写代码会出现NullPointerException异常（空指针异常）
        /*
        c.d = d;
        b.c = c;
        a.b = b;
        t.a = a;
        */

        // 编写代码通过t来访问d中的i
        System.out.println(t.a.b.c.d.i);
    }
}

class A {
    B b;
}

class B {
    C c;
}

class C {
    D d;
}

class D {
    int i;
}
