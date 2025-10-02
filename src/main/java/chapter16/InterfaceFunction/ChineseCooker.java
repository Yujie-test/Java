package chapter16.InterfaceFunction;

// 中餐厨师
// 实现菜单上的菜
// 厨师是接口的实现者
public class ChineseCooker implements FoodMenu{
    // 辣子鸡
    public void ChongQinChicken(){
        System.out.println("Chinese Chef cooked the ChongQin chicken!");
    }

    // 牛肉汉堡
    public void BeefBurger(){
        System.out.println("Chinese Chef cooked the beef burger!");
    }
}
