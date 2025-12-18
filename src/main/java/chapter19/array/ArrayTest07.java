package chapter19.array;

/*
    一维数组的深入，数组中存储的类型为：引用数据类型
    对于数组来说，实际上只能存储java对象的“内存地址”。数组中存储的每个元素是“引用”
*/

public class ArrayTest07 {
    public static void main(String[] args) {
        // array是一个数组
        // array[1]是一个元素
        int[] array = {1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            /*int a = array[i];
            System.out.println(a);*/
            // 合并代码
            System.out.println(array[i]);
        }

        // 创建一个Animal类型的数组
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = new Animal();
        Animal[] animals = {a1, a2, a3};

        // 对Animal数组进行遍历
        for (int i = 0; i < animals.length; i++) {
            animals[i].move(); // 这个move方法不是数组的。是数组当中Animal对象的move方法
        }

        // 动态初始化一个长度为2的Animal类型数组
        Animal[] ans = new Animal[2];
        // 创建一个Animal对象，放到数组的第一个盒子中
        ans[0] = new Animal();
        // Animal数组中只能存放Animal类型，不能存放Product类型
        //ans[1] = new Product();

        // Animal数组中可以存放Cat类型的数据，因为Cat是一个Animal
        // Cat是Animal的子类
        ans[1] = new Cat();
        for (int i = 0; i < ans.length; i++) {
            ans[i].move();
        }

        // 创建一个Animal类型的数组，数组当中存储Cat和Bird
        Animal[] aa = {new Cat(), new Bird()}; // 该数组中存储了两个对象的内存地址
        for (int i = 0; i < aa.length; i++) {
            // 这个取出来的可能是Cat，也可能是Bird，但肯定是一个Animal
            // 如果调用的方法是父类中存在的方法不需要向下转型。直接使用父类型引用调用即可
            //Animal an = aa[i];
            //an.move();

            // Animal中没有sing方法
            // aa[i].sing();

            // 调用子对象特有方法的话，需要向下转型！！！
            if (aa[i] instanceof Cat){
                ((Cat) aa[i]).catchMouse();
            } else {
                ((Bird) aa[i]).sing();
            }
        }
    }
}

class Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("Cat walk!");
    }
    // 特有方法
    public void catchMouse(){
        System.out.println("Cat catch mouse!");
    }
}

class Bird extends Animal{
    public void move(){
        System.out.println("Bird Fly!");
    }
    // 特有方法
    public void sing(){
        System.out.println("Bird sing!");
    }
}

// 商品类
class Product{}