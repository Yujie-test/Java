package chapter18;

/*
    关于Object类中的equals()方法
        1、equals()方法的源代码
            public boolean equals(Object obj) {
                return (this == obj);
            }
            以上这个方法是Object类的默认实现

        2、SUN公司设计equals()方法的目的是什么？
            以后编程的过程当中，都需要通过equals()方法来判断两个对象是否相等。
            equals()方法是判断两个对象是否相等的

        3、我们需要研究一下Object类给的这个默认的equals()方法够不够用！！！
            在Object类中的equals()方法当中

        4、判断两个java对象是否相等，不能使用“==”，因为“==”比较的是两个对象的内存地址
*/

public class Test02 {
    public static void main(String[] args) {

        // 判断两个基本数据类型的数据是否相等直接使用“==”就行。
        int a = 100;
        int b = 100;
        // 这个“==”是判断a中保存的100和b中保存的100是否相等
        System.out.println(a == b); // true（相等）；false（不相等）

        // 判断两个java对象是否相等，我们怎么办？能直接使用“==”吗？
        // 创建一个日期对象
        myTime1 mt1 = new myTime1();
        // 创建一个新的日期对象
        myTime1 mt2 = new myTime1();

        // 测试一下，比较两个对象是否相等，能不能使用“==”？？？
        // 这里的“==”判断的是：mt1中保存的内存地址和mt2中保存的对象内存地址是否相等
        System.out.println(mt1 == mt2); // false

        // 重写Object equals()方法之前
        //System.out.println(mt1.equals(mt2)); // false

        // 重写Object equals()方法之后（比较的是内容）
        System.out.println(mt1.equals(mt2)); // true

        // 再创建一个新的日期
        myTime1 mt3 = new myTime1(2008, 8, 8);
        // 两个日期不相等，就是false
        System.out.println(mt1.equals(mt3)); // false

        // 我们这个程序有bug吗？可以运行，但是效率怎么样？低（怎么改造）
        myTime1 mt4 = null;
        System.out.println(mt1.equals(mt4)); // false
    }
}

class myTime1{ // extends Object{
    int year;
    int month;
    int day;

    public myTime1(){}

    public myTime1(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 默认的equals()方法
    /*public boolean equals(Object obj) {
        return (this == obj);
    }*/

    // 重写equals()方法
    // 怎么重写？复制粘贴。相同的返回值类型、相同的方法名、相同的形式参数列表
    /*public boolean equals(Object obj) {
        // 当年相同，月相同，并且日也相同的时候，表示两个日期相同。两个对象相等
        // 获取第一个日期的年月日
        int year1 = this.year;
        int month1 = this.month;
        int day1 = this.day;

        // 获取第二个日期的年月日
        int year2 = obj.year;
        int month2 = obj.month;
        int day2 = obj.day;

        if (obj instanceof myTime1){
            myTime1 mt = (myTime1)obj;
            int year2 = mt.year;
            int month2 = mt.month;
            int day2 = mt.day;
            if (year1 == year2 && month1 == month2 && day1 == day2){
                return true;
            }
        }
        // 程序能够执行到此处表示日期不相等
        return false;
    }*/

    // 改良equals()方法
    /*public boolean equals(Object obj) {
        // 如果obj是空，直接返回false
        if (obj == null){
            return false;
        }

        // 如果obj不是一个myTime1，没必要比较了，直接返回false
        if (!(obj instanceof myTime1)){
            return false;
        }

        // 如果this和obj保存的内存地址相同，没必要比较了，直接返回true
        // 内存地址相同的时候指向的堆内存的对象肯定是同一个
        if (this == obj){
            return true;
        }

        // 程序能够执行到此处说明什么？
        // 说明obj不是null，obj是myTime1类型
        myTime1 mt = (myTime1)obj;
        if (this.year == mt.year && this.month == mt.month && this.day == mt.day){
            return true;
        }

        // 程序能够执行到此处表示日期不相等
        return false;
    }*/


    // 再次改良
    public boolean equals(Object obj) {
        // 如果obj是空或者obj不是一个myTime1，直接返回false
        if (obj == null || !(obj instanceof myTime1)){
            return false;
        }

        // 如果this和obj保存的内存地址相同，没必要比较了，直接返回true
        // 内存地址相同的时候指向的堆内存的对象肯定是同一个
        if (this == obj){
            return true;
        }

        // 程序能够执行到此处说明什么？
        // 说明obj不是null，obj是myTime1类型
        myTime1 mt = (myTime1)obj;
        return this.year == mt.year && this.month == mt.month && this.day == mt.day;
    }
}
