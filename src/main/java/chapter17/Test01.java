package chapter17;

public class Test01 {
    public static void main(String[] args) {

        // 创建HelloWorld对象
        // HelloWorld的完整类名：com.bjpowernode.javase.chapter17.HelloWorld
        chapter17.HelloWorld hw = new chapter17.HelloWorld();

        System.out.println(hw); //chapter17.HelloWorld@1540e19d

        // 包名可以省略吗
        HelloWorld hw2 = new HelloWorld();
        System.out.println(hw2);
    }
}
