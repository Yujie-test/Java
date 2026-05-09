package chapter19.array.homework;

public class Play {
    public static void main(String[] args) {
        Army a = new Army(4);
        Knife k = new Knife();
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        Tank t3 = new Tank();

        a.addWeapon(k);
        a.addWeapon(t1);
        a.addWeapon(t2);
        int attack = a.attackAll();
        System.out.println("本回合您的总攻击数是：" + attack);
        int move = a.moveAll();
        System.out.println("本回合您的总移动数是：" + move);
        a.addWeapon(t3);
        int attack1 = a.attackAll();
        System.out.println("本回合您的总攻击数是：" + attack1);
        int move1 = a.moveAll();
        System.out.println("本回合您的总移动数是：" + move1);
    }
}
