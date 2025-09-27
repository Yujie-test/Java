package chapter16;
/*
    继承和实现都存在的话，代码应该怎么写？
        extends 关键字在前
        implements 关键字在后
*/ 
public class InterfaceTest04 {
    public static void main(String[] args) {
        // 创建对象（表面上看Animal1类没起作用）
        Flyable f = new Cat1(); // 多态
        f.fly();

        // 同一个接口
        Flyable f2 = new Pig();
        // 调用同一个fly()方法，最后的执行效果不同
        f2.fly();

        Flyable f3 = new Fish(); // 多态
        f3.fly();
    }
}


// 动物类：父类
class Animal1{

}

// 可飞翔的接口（是一对翅膀）
// 能插拔的就是接口。（没有接口你怎么插拔）
// 内存条插到主板上，他们之间有接口，内存条可以更换
// 接口通常提取的是行为动作
interface Flyable{
    void fly();
}

// 动物类子类：猫类
// Flyable是一个接口，是一对翅膀的接口，通过接口插到猫身上，让猫变得可以飞翔
class Cat1 extends Animal1 implements Flyable{
    @Override
    public void fly() {
        System.out.println("Cat is flying!");
    }
}

// 蛇类，如果你不想让它飞，可以不实现Flayable接口
// 没有实现这个接口表示你没有翅膀，没有给你翅膀，你肯定不能飞
class snake extends Animal1{}

class Pig extends Animal1 implements Flyable{
    @Override
    public void fly() {
        System.out.println("Pig is flying!");
    }
}


// 鱼（默认实际上是存在继承，默认继承Object）
//class Fish extends Object implements Flyable{}c
class Fish implements Flyable{
    // 没写extends，也是有的，默认继承Object

    @Override
    public void fly() {
        System.out.println("Fish is flying!");
    }
}