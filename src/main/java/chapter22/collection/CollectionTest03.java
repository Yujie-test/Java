package chapter22.collection;

/*
    关于集合遍历/迭代专题
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c1 = new ArrayList(); // ArrayList集合：有序可重复
        // 添加元素
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);
        c1.add(1);

        // 迭代集合
        Iterator iter = c1.iterator();
        while (iter.hasNext()) {
            // 存进去是什么类型，取出来还是什么类型
            Object obj = iter.next();
            /*if (obj instanceof Integer) {
                System.out.println("Integer");
            }*/
            // 只不过在输出的时候会转换成字符串，因为这里println会调用toString()方法
            System.out.println(obj);
        }

        // HashSet集合：无序不可重复
        Collection c2 = new HashSet();
        // 无序：存进去和取出来的顺序不一定相同
        // 不可重复：存储100，不能再存储100
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(90);
        c2.add(400);
        c2.add(50);
        c2.add(60);
        c2.add(100);
        Iterator iter2 = c2.iterator();
        while (iter2.hasNext()) {
            Object obj = iter2.next();
            System.out.println(obj);
        }
    }
}
