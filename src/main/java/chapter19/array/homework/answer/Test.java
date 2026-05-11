package chapter19.array.homework.answer;

public class Test {
    public static void main(String[] args) {
        // 创建一个武器库
        Weapons weapons = new Weapons(4);
        // 创建武器对象
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        Rifle rifle = new Rifle();
        Vehicle vehicle = new Vehicle();
        Fighter fighter2 = new Fighter();

        // 添加武器
        try {
            weapons.addWeapon(fighter);
            weapons.addWeapon(tank);
            weapons.addWeapon(rifle);
            weapons.addWeapon(vehicle);
            weapons.addWeapon(fighter2);
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
        }

        // 让所有可移动的移动
        int damage = weapons.attackAll();
        System.out.println("本回合您的总攻击数是：" + damage);

        // 让所有珂攻击的攻击
        int distance = weapons.moveAll();
        System.out.println("本回合您的总移动数是：" + distance);

    }
}
