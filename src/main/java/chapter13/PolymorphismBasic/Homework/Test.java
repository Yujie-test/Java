package chapter13.PolymorphismBasic.Homework;

public class Test {
    public static void main(String[] args) {
        Master m = new Master();
        Cat c = new Cat();
        Dog d = new Dog();

        m.feed(c);
        m.feed(d);
    }
}
