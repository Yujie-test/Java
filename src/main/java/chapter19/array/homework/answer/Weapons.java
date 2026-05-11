package chapter19.array.homework.answer;

/*
    武器库
    类在强制类型转换过程中，如果是类转换成接口类型
    那么类和接口之间不需要存在继承关系，也可以转换，java中允许
*/

import chapter19.array.homework.answer.Weapon;

public class Weapons {

    /*
    武器数组
    */

    Weapon[] w;

    /**
     * 创建武器库的构造方法
     * @param maxNum 武器数量
     */
    public Weapons(int maxNum) {
        // 动态初始化数组中每一个元素默认值是null
        // 武器数组是有了，但是武器数组中没有放武器
        this.w = new Weapon[maxNum];
    }

    /**
     * 把武器加入到武器库中
     * @param wa 新武器
     */
    public void addWeapon(Weapon wa) throws AddWeaponException {
        for (int i = 0; i < w.length; i++) {
            if (w[i] == null){
                w[i] = wa;
                System.out.println(wa.name + " has added successfully!");
                return;
            }
        }
        // 如果程序执行到此处说明，武器没有添加成功
        throw new AddWeaponException("Your Weapons has exceed limits!");
    }

    /**
     * 所有武器库中可攻击的武器攻击
     * @return 本回合总的攻击值
     */
    public int attackAll(){
        // 遍历数组
        int attackNum = 0;
        for (int i = 0; i < w.length; i++) {
            if (w[i] instanceof Shootable){
                Shootable shootable = (Shootable)w[i];
                shootable.shoot();
                attackNum += w[i].damage;
            }
        }
        return attackNum;
    }

    /**
     * 所有武器库中可移动的武器移动
     * @return 本回合总的移动值
     */
    public int moveAll(){
        int moveNum = 0;
        for (int i = 0; i < w.length; i++) {
            if (w[i] instanceof Portable){
                Portable portable = (Portable)w[i];
                portable.move();
                moveNum += w[i].distance;
            }
        }
        return moveNum;
    }
}
