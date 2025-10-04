package chapter16.InterfaceFunction;

public class Test {
    public static void main(String[] args) {
        // 创建厨师对象
        //FoodMenu cooker1 = new ChineseCooker();
        FoodMenu cooker1 = new ForeignCooker();
        // 创建顾客对象
        Customer c = new Customer(cooker1);
        // 顾客点餐
        c.order();
    }
}