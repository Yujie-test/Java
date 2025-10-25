package chapter17.访问控制权限;

/*
访问控制权限修饰符       本类      同包      子类      任意位置
-----------------------------------------------------------------
public                可以      可以      可以      可以
protected             可以      可以      可以      不可以
默认                   可以      可以     不可以     不可以
private               可以      不可以    不可以     不可以

范围从大到小排序：public > protected > 默认 > private
*/

public class User {
    // 给一些属性
    // 私有的，只能在本类中访问
    private int id;
    // 受保护的，表示只能在本类、同包、子类中访问
    protected int age;
    // 公开的，在任何位置都可以访问
    public int weight;
    // 默认的，表示只能在本类以及同包下访问
    String name;

    // 方法
    public void m1(){};
    private void m2(){};
    protected void m3(){};
    void m4(){};

    // 静态方法也可以
    public static void x(){};
    private static void y(){};
    protected static void z(){};
    static void k(){};
}

// 错误：此处不允许使用修饰符private
/*private class MyClass {
}*/

// 错误：此处不允许使用修饰符protected
/*protected class MyClass {
}*/

class MyClass{}

