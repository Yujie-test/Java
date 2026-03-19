package chapter20.number;

/*
    1、BigDecimal属于大数据，精度极高。不属于基本数据类型，属于Java对象（引用数据类型），这是SUN提供的一个类，专门用在财务软件当中
    2、注意：财务软件中double是不够的
        面试题：你处理过财务数据吗？用的哪一种数据类型？
            千万别说double，说java.math.BigDecimal
*/

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecimalTest01 {
    public static void main(String[] args){
        // 这个100不是普通的100，是精度极高的100
        BigDecimal v1 = new BigDecimal(100);

        // 精度极高的200
        BigDecimal v2 = new BigDecimal(200);

        // 求和
        // v1 + v2 // 这样不行，v1和v2都是引用，不能直接使用+求和
        BigDecimal v3 = v1.add(v2); // 调用方法求和
        System.out.println(v3); //300

        System.out.println(v2.divide(v1));
    }
}
