package chapter13.PolymorphismBasic.Homework;

public class Homework2 {
    public static void main(String[] args) {
        Musician m = new Musician();
        Violin v = new Violin();
        Piano p = new Piano();
        m.play(v);
        m.play(p);
    }
}

// 乐器父类
class Instrument{
    // 乐器发声
    public void makeSound(){}
}

// 子类
class Violin extends Instrument{
    public void makeSound(){
        System.out.println("Violin's sound!");
    }
}

// 子类
class Piano extends Instrument{
    public void makeSound(){
        System.out.println("Piano's sound!");
    }
}

// 乐手类
class Musician{
    public void play(Instrument i){
        i.makeSound();
    }
}
