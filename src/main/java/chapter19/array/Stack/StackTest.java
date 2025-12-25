package chapter19.array.Stack;

/*
    第一题：
        编写程序，使用一维数组，模拟栈数据结构
        要求：
            1、这个栈可以存储java中的任何引用类型的数据
            2、在栈中提供push方法模拟压栈（栈满了，要有提示信息）
            3、在栈中提供pop方法模拟弹栈（栈空了，也要有提示信息）
            4、编写测试程序，new栈对象，调用push pop方法来模拟压栈、弹栈的动作
            5、假设栈的默认初始化容量是3（请注意无参数构造方法的编写方式）
*/

public class StackTest {
    public static void main(String[] args) {

        // 创建一个栈对象，初始化容量
        Stack s = new Stack(8);
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());
        s.push(new Object());
        s.push(new Object()); // 最后压入的，最先弹出来（这个才符合栈的数据结构）

        // 压这个元素失败了
        s.push(new Object());

        // 弹栈
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();

        s.pop();
    }
}


