package chapter19.array.homework.answer;

/*
    步枪是武器，不可以移动，可以攻击
*/

public class Rifle extends Weapon implements Shootable{

    public Rifle() {
        this.name = "Rifle";
        this.damage = 9;
        this.distance = 0;
    }

    @Override
    public void shoot() {
        System.out.println(name + " starts to shoot, causes " + this.damage + " damage.");
    }
}
