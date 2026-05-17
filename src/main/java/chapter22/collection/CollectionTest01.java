package chapter22.collection;

/*
关于java.util.collection接口中的常用方法
    1、Collection中能存放什么元素？
        没有使用“泛型“之前，Collection中可以存储Object的所有子类型
        使用了“泛型”之后，Collection中只能存储某个具体的类型。
        集合后期我们会学习“泛型”语法。目前先不用管。Collection中什么都能存，
        只要是Object的子类型就行（集合中不能直接存储基本数据类型，也不能存java对象，只是存储java对象的内存地址）

    2、Collection中的常用方法：
        boolean add(Object e) 向集合中添加元素
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
        // 创建一个集合对象
        //Collection c = new Collection() // 接口是抽象的，无法实例化
        // 多态
        Collection c = new ArrayList();
        // 测试Collection接口中的常用方法
        c.add(200); // 自动装箱，实际上是放进去了一个对象的内存地址。Integer x = new Integer(1200);
        c.add(3.14); // 自动装箱
        c.add(new Object());
        c.add(new Student());
        c.add(true); // 自动装箱
    }
}

class Student{}
