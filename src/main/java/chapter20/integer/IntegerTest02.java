package chapter20.integer;

/*
    1、8种基本数据类型对应的包装类型名是什么
        基本数据类型                包装类型
        --------------------------------------
        byte                      java.lang.Byte（父类：Number）
        short                     java.lang.Short（父类：Number）
        int                       java.lang.Integer（父类：Number）
        long                      java.lang.Long（父类：Number）
        float                     java.lang.Float（父类：Number）
        double                    java.lang.Double（父类：Number）
        boolean                   java.lang.Boolean（父类：Object）
        char                      java.lang.Character（父类：Object）

    2、以上种包装类中，重点以java.lang.Integer为代表进行学习，其他的类型照葫芦画瓢就行

    3、八种包装类型中其中6个都是数字对应的包装类，他们的父类都是Number，可以研究一下Number中公共的方法
        Number是一个抽象类，无法实例化对象
        Number类中有这样的方法：
            abstract int intValue(); 以int形式返回指定的数值
            abstract long longValue(); 以long形式返回指定的数值
            abstract float floatValue(); 以float形式返回指定的数值
            abstract double doubleValue(); 以double形式返回指定的数值
            byte byteValue() 以byte形式返回指定的数值
            short shortValue() 以short形式返回指定的数值
            这些方法其实所有的数字包装类的子类都有，这些方法是负责拆箱的
 */

public class IntegerTest02 {
    public static void main(String[] args) {
        Byte b;
        Integer i;
        Character c;

        // 123这个基本数据类型，进行构造方法的包装达到了：基本数据类型向引用数据类型的转换
        // 基本数据类型 -（转换为）-> 引用数据类型（装箱）
        Integer i1 = new Integer(123);

        // 将引用数据类型 -（转换为）-> 基本数据类型
        float f = i1.floatValue();
        System.out.println(f); //123.0

        // 将引用数据类型 -（转换为）-> 基本数据类型（拆箱）
        int retValue = i1.intValue();
        System.out.println(retValue); //123
    }
}
