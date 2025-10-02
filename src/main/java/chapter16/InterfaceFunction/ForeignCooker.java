package chapter16.InterfaceFunction;

// 西餐厨师
// 实现菜单上的菜
// 厨师是接口的实现者
public class ForeignCooker implements FoodMenu{
    public void ChongQinChicken(){
        System.out.println("Foreign Chef cooked the ChongQin chicken!");
    }

    // 牛肉汉堡
    public void BeefBurger(){
        System.out.println("Foreign Chef cooked the beef burger!");
    }
}
