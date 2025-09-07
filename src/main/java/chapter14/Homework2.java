package chapter14;

public class Homework2 {
    public static void main(String[] args) {
        Number n = new Number();
        n.setN1(2);
        n.setN2(9);
        System.out.println(n.addition());
        System.out.println(n.subtraction());
        System.out.println(n.multiplication());
        System.out.println(n.division());
    }
}

class Number{
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int addition(){
        return getN1() + getN2();
    }

    public int subtraction(){
        return getN1() - getN2();
    }

    public int multiplication(){
        return getN1() * getN2();
    }

    public double division(){
        if (getN2() == 0){
            System.out.println("除数不能为0！");
            return 0;
        }
        return (double) getN1() / getN2();
    }
}
