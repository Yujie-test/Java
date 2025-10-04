package chapter16.Homework;

public class Test {
    public static void main(String[] args) {
        InsertDrawable p = new Printer();
        InsertDrawable m = new Mouse();
        InsertDrawable s = new Screen();
        InsertDrawable k = new KeyBoard();

        Laptop l1 = new Laptop(p);
        l1.ReadyToConnect();

        Laptop l2 = new Laptop(m);
        l2.ReadyToConnect();

        Laptop l3 = new Laptop(s);
        l3.ReadyToConnect();

        Laptop l4 = new Laptop(k);
        l4.ReadyToConnect();
    }
}
