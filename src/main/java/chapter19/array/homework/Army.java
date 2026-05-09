package chapter19.array.homework;

/*
    军队
*/

public class Army {
    int maxNum;

    /*
    武器数组
    */

    Weapon[] w;

    int pointer = 0;

    /**
     * 创建军队的构造方法
     * @param maxNum 武器数量
     */
    public Army(int maxNum) {
        // 动态初始化数组中每一个元素默认值是null
        // 武器数组是有了，但是武器数组中没有放武器
        this.w = new Weapon[maxNum];
    }

    /**
     * 把武器加入到武器库中
     * @param wa 新武器
     */
    public void addWeapon(Weapon wa){
        w[pointer] = wa;
        pointer++;
    }

    /**
     * 所有武器库中的武器攻击
     * @return 本回合总的攻击值
     */
    public int attackAll(){
        int attackNum = 0;
        for (int i = 0; i < pointer; i++) {
            attackNum += w[i].attack;
        }
        return attackNum;
    }

    /**
     * 所有武器库中的武器移动
     * @return 本回合总的移动值
     */
    public int moveAll(){
        int moveNum = 0;
        for (int i = 0; i < pointer; i++) {
            moveNum += w[i].move;
        }
        return moveNum;
    }
}
