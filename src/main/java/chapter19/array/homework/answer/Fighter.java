package chapter19.array.homework.answer;

/*
    战斗机是武器，可以移动，可以攻击
*/

public class Fighter extends Weapon implements Shootable, Portable{

    public Fighter() {
        this.name = "Fighter";
        this.damage = 9;
        this.distance = 9;
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
