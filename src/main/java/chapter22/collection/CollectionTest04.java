package chapter22.collection;

/*
    深入Collection集合的contains方法：
        boolean contains(Object o)
            判断集合中是否包含某个对象a
            如果包含返回true，如果不包含就返回false。

    contains方法是用来判断集合中是否包含某个元素的方法：
        那么它在底层是怎么判断集合中是否包含某个元素的呢？
            调用了equals方法进行对比。
            equals方法返回true，就表示包含这个元素。
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest04 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList();

        // 添加元素
        String s1 = new String("abc"); // s1 = 0x99
        c.add(s1); // 放进去了一个abc

        String s2 = new String("def"); // s2 = 0x77
        c.add(s2);

        // 集合中元素个数
        System.out.println(c.size()); //2

        // 新建的对象String
        String x = new String("abc");
        // c集合中是否包含x？结果猜测一下是true还是false？
        System.out.println(x.equals(s1)); //true
        System.out.println(c.contains(x)); //true 判断集合中是否存在“abc”
    }
}
