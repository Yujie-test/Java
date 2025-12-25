package chapter19.array.Stack;

public class Stack { // 栈类

    // 提供一个数组来存储栈中的元素
    // 向栈当中存储元素，我们这里使用一维数组模拟。存到栈中，就表示存到数组中
    // 因为数组是我们学习java的第一个容器
    // 为什么选择Object类型数组？因为这个栈可以存储java中的任何引用类型的数据
    // new Animal()对象可以放进去，new Person()对象也可以放进去。因为Animal和Person的超级父类就是Object
    // 包括String也可以存储进去。因为String父类也是Object

    private Object[] elements;

    // 栈帧（永远指向栈顶部的元素）
    // 每加一个元素，栈帧+1
    // 每减一个元素，栈帧-1
    //private int index = 0; // 如果index采用0，表示栈帧指向了顶部元素的上方
    private int index = -1; // 如果index采用-1，表示栈帧指向了顶部元素


    // set和get也许用不上，但是你必须写上，这是规矩。你使用IDEA生成就行了
    // 封装：第一步：属性私有化，第二步：对外提供set和get方法
    public Object[] getElements() {
        return elements;
    }
    public int getIndex() {
        return index;
    }
    public void setElements(Object[] elements) {
        this.elements = elements;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    // 构造方法
    // 构造方法是不是应该给一维数组一个初始化容量
    public Stack(int len) {
        this.elements = new Object[len];
    }
    public Stack() {
        // 一维数组动态初始化
        // 默认初始化容量是3
        this.elements = new Object[3];
    }

    // push方法（push方法压栈）
    // 压栈表示栈中多一个元素
    public void push(Object e){
        if (index == this.elements.length - 1){
            System.out.println("Stack is full, push failed!");
            return;
        }
        // 程序能执行到这里，说明栈没满
        // 向栈中加一个元素，栈帧向上移动一个位置
        this.index++;
        this.elements[index] = e;
        System.out.println("Push " + elements[index] + " succeed, pointed to " + index);
    }

    // 但是栈如果已空，弹栈失败
    // 这个方法的参数以及返回值类型自己定义
    public void pop(){
        if (index < 0){
            System.out.println("Stack is empty, pop failed!");
            return;
        }
        // 程序能执行到此处说明栈没有空
        System.out.print("Pop " + elements[index] + " succeed");
        // 栈帧向下移动一位
        index--;
        System.out.println(", pointed to " + index);
    }
}
