package chapter16;
/*
    接口和接口之间支持多继承，那么一个类可以同时实现多个接口吗？
        对于计算机来说，一个机箱上有多个接口，一个接口是接键盘的，一个接口是接鼠标的，
        一个接口是接电源的，一个接口是接显示器的......

       一个类可以同时实现多个接口

       这种机制弥补了java中的那个缺陷？
        java中类和类只支持单继承。实际上单继承是为了简单而出现的，现实世界中存在多继承，java中的接口弥补了但继承带来的缺陷

       接口A和接口B虽然没有继承关系，但是写代码的时候，可以互转。编译器没意见。但是运行时可能出现：ClassCastException

       之前有一个结论：
        无论是向上转型，还是向下转型，两种类型之间必须要有继承关系
        没有继承关系编译器会报错。（这句话不适用在接口方面）
        最终实际上和之前还是一样，需要加：instanceof运算符进行判断
        向下转型养成好习惯。转型之前加if+instanceof进行判断

*/ 
public class InterfaceTest03 {
    public static void main(String[] args) {
        // 多态该怎么用呢？
        // 都是父类型的引用指向子类型的对象
        A1 a = new D();
        B1 b = new D();
        C1 c = new D();

        D d = (D)a;
        d.m2();

        // 这个编译没问题，运行也没问题
        // 调用其他接口中的方法，你需要转型（接口转型）
        B1 b2 = (B1)a;
        b2.m2();

        N n = new E();
        // 经过测试：接口和接口之间在进行强制类型转换的时候，没有继承关系，也可以强转
        // 但是一定要注意，运行时可能会出现ClassCastException异常
        // 编译没问题，运行有问题
        //M m = (M)n;
        if(n instanceof M){
            M m = (M)n;
        }
    }
}

interface M{}
interface N{}
class E implements N{} // 接口和接口支持多继承

// ------------------------------------------------------------------------------
interface X{}
interface Y{}
interface Z extends X,Y{} // 接口和接口支持多继承

// ------------------------------------------------------------------------------

interface A1{
    void m1();
}

interface B1{
    void m2();
}

interface C1{
    void m3();
}

// 实现多个接口，其实就类似于多继承
class D implements A1, B1, C1{
    public void m1(){};
    public void m2(){
        System.out.println("m2");
    };
    public void m3(){};
}