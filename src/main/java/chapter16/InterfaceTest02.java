package chapter16;
/*
    接口的基础语法：
        1、类和类之间叫做继承，类和接口之间叫做实现
        别多想：你仍然可以将“实现”看作“继承”
        继承使用extends关键字完成
        实现使用implements关键字完成

        2、当一个非抽象的类实现接口的话，必须将接口中的所有的抽象方法全部实现（覆盖、重写）
*/ 
public class InterfaceTest02 {
    public static void main(String[] args) {

        // 错误：chapter16.MyMath是抽象的; 无法实例化
        //new MyMath();

        // 能使用多态吗？可以
        // 父类型的引用指向子类型的对象
        MyMath mm = new MyMathImpl();
        // 调用接口里面的方法（面向接口编程）
        System.out.println(mm.subtract(3, 2));
        System.out.println(mm.sum(3, 2));
    }
}

// 特殊的抽象类，完全抽象的，叫做接口
interface MyMath{
    double PI = 3.1415926;
    public abstract int sum(int a, int b);
    int subtract(int a, int b);
}

// 编写一个类（这个类是一个“非抽象”的类）
// 这个类的名字是随意的
/*abstract class MyMathImpl implements MyMath{

}*/

// 错误：chapter16.MyMathImpl不是抽象的, 并且未覆盖chapter16.MyMath中的抽象方法subtract(int,int)
/*class MyMathImpl implements MyMath{
}*/

// 修正
class MyMathImpl implements MyMath{
    // 错误：正在尝试分配更低的访问权限; 以前为public
    /*int sum(int a, int b){
        return a + b;
    }*/

    // 重写/覆盖/实现 接口中的方法（通常叫做实现）
    public int sum(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }
}

