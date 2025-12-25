package chapter19.array;

/*
    第一题：
        编写程序，使用一维数组，模拟栈数据结构
        要求：
            1、这个栈可以存储java中的任何引用类型的数据
            2、在栈中提供push方法模拟压栈（栈满了，要有提示信息）
            3、在栈中提供pop方法模拟弹栈（栈空了，也要有提示信息）
            4、编写测试程序，new栈对象，调用push pop方法来模拟压栈、弹栈的动作
*/

public class ArrayHomework01 {
    public static void main(String[] args) {

    }
}

class MyStack{ // 栈类

    // 提供一个数组来存储栈中的元素
    Object[] elements;

    // 栈帧（永远指向栈顶部的元素）
    // 每加一个元素，栈帧+1
    // 每减一个元素，栈帧-1
    int index;

    // 构造方法
    // 构造方法是不是应该给一维数组一个初始化容量


    // push方法（push方法压栈）
    // 压栈表示栈中多一个元素
    // 但是栈如果已空，弹栈失败
    // 这个方法的参数以及返回值类型自己定义

}
