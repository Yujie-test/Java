package chapter20.number;

/*
    关于数字的格式化（了解）
*/

import java.text.DecimalFormat;

public class DecimalFormatTest01 {
    public static void main(String[] args){
        // java.text.DecimalFormat 专门负责数字格式化的
        //DecimalFormat df = new DecimalFormat("数字格式");

        /*
        数字格式有哪些？
            # 代表任意数字
            , 代表千分位
            . 代表小数点
            0 代表不够时补0

            ###,###.## 表示加入千分位，保留两位小数，四舍五入
        */
        DecimalFormat df = new DecimalFormat("###,###.##");
        System.out.println(df.format(1234.56)); //1,234.56
        System.out.println(df.format(1234.56723)); //1,234.57

        DecimalFormat df2 = new DecimalFormat("###,###.0000"); // 保留四位小数，不够时补0
        System.out.println(df2.format(1234.56)); //1,234.5600
    }
}
