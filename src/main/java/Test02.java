// 将需要的类导入
import chapter17.HelloWorld;
import chapter17.*;

public class Test02 {
    public static void main(String[] args) {
        /*
            Test02不在chapter17包下
            HelloWorld在chapter17包下
            不在同一个package下，包名可以省略吗？
                不能省略
        */

        // 错误：找不到符号
        /*HelloWorld hw = new HelloWorld();
        System.out.println(hw);*/

        /*chapter17.HelloWorld hw = new chapter17.HelloWorld();
        System.out.println(hw);
        chapter17.HelloWorld hw2 = new chapter17.HelloWorld();
        System.out.println(hw);
        chapter17.HelloWorld hw3 = new chapter17.HelloWorld();
        System.out.println(hw); */

        HelloWorld hw = new HelloWorld();
        System.out.println(hw);
    }
}
