package chapter13.PolymorphismBasic.Homework;

public class Master {
    public void feed(Pet p){
        System.out.println("Master started to feed his pet!");
        p.eat();
    }
}
