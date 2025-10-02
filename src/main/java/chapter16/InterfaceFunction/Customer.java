package chapter16.InterfaceFunction;

// 顾客

public class Customer {
    // 顾客手里有一个菜单
    // Customer has a FoodMenu！（这句话什么意思：顾客有一个菜单）
    // 记住：以后凡是能够使用has a 来描述的，统一以属性的方式存在
    // 实例变量：属性
    // 面向抽象编程，面向接口编程，降低程序的耦合度，提高程序的扩展力
    private FoodMenu fm; // 都要养成封装的好习惯

    // 如果以下这样写，就表示写死了（焊接了，不可插拔）
    // 中餐厨师
    //ChineseCooker cc;
    // 西餐厨师
    //ForeignCooker fc;

    // 构造方法
    public Customer() {
    }
    public Customer(FoodMenu fm) {
        this.fm = fm;
    }

    // setter and getter

    public FoodMenu getFm() {
        return fm;
    }
    public void setFm(FoodMe nu fm) {
        this.fm = fm;
    }
}

/*
// “自己”类
// Myself has a friend
class Myself{
    // 你这个对象，应该有一个朋友对象的电话号码
    // 电话号码就是一个对象的内存地址。联系你朋友的时候，打电话
    // f是一个引用。f默认值是null，是null表示你没有朋友
    Friend f;

    // 通过构造方法能不能给你一个朋友对象
    public Myself(Friend f){
        this.f = f;
    }

    public static void main(String[] args) {
        // 创建朋友对象
        Friend f = new Friend(); // 朋友对象有了

        // 创建对象的同时交朋友
        Myself m = new Myself(f);

        // 创建自己对象
        // 目前还没有交朋友
        Myself m = new Myself(); // 自己对象
        // 交朋友
        m.f = f; // 把朋友地址给了你
    }
}
// “朋友”类
class friend{
}
*/
