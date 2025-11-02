package chapter18;

/*
    关于Object类中的toString()方法
        1、源代码长什么样
            public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }
            源代码上toString()方法的默认实现是：
                类名@对象的内存地址转换为十六进制的形式

        2、SUN公司设计toString()方法的目的是什么？
            toString()方法的作用是什么
                toString()方法的设计目的是：通过调用这个方法可以将一个“java对象”转换成“字符串”表示形式

        3、其实SUN公司开发java语言的时候，建议所有的子类都去重写toString()方法。
            toString()方法应该是一个“concise but informative representation that is easy for a person to read”
*/

public class Test01 {
    public static void main(String[] args) {
        myTime mt = new myTime(2025, 11, 1);
        // 一个日期对象转换成字符串的话，我可能还是希望能看到具体的日期信息
        String s1 = mt.toString();

        // MyTime类重写toString()方法之前
        //System.out.println(mt.toString()); // chapter18.myTime@1540e19d

        // MyTime类重写toString()方法之后
        System.out.println(s1); // 2025-11-1

        // 注意：输出引用的时候，会自动调用该引用的toString()方法
        System.out.println(mt);


    }
}

class myTime{
    int year;
    int month;
    int day;

    public myTime(){}

    public myTime(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // 重写toString()方法
    // 这个toString()方法怎么重写呢
    // 越简洁越好、可读性越强越好
    // 向简洁的、翔实的、易阅读的方向发展
    public String toString(){
        return this.year + "-" + this.month + '-' + this.day;
    }
}
