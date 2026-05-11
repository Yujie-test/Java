package chapter19.array.homework.answer;

/*
    坦克是武器，可以移动，可以攻击
*/

public class Tank extends Weapon implements Shootable, Portable{

    public Tank() {
        this.name = "Tank";
        this.damage = 4;
        this.distance = 4;
    }

    @Override
    public void shoot() {
        System.out.println(name + " starts to shoot, causes " + damage + " damage.");
    }

    @Override
    public void move() {
        System.out.println(name + " starts to move, moves " + distance + " km.");
    }
}
