package chapter19.array.homework.answer;

/*
    车辆是武器，可以移动，不可以攻击
*/

public class Vehicle extends Weapon implements Portable{

    public Vehicle() {
        this.name = "Vehicle";
        this.damage = 0;
        this.distance = 8;
    }
    @Override
    public void move() {
        System.out.println(name + " starts to move, moves " + distance + " km.");
    }
}
