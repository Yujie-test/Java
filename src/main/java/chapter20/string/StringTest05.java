package chapter20.string;

/*
*/

public class StringTest05 {
    public static void main(String[] args) {

        // String类当中常用方法
        // 1（掌握）. char.charAt(int index)
        char c = "Chinese".charAt(1); //"Chinese"是一个字符串String对象。只要是对象就能”点“
        System.out.println(c); //h

        // 2（了解）. int char.compareTo(String anotherString)
        // 拿着第一个字符串的第一个字母和后一个字符串的第一个字母比较，能分出胜负就不再比较了
        // 字符串比较大小不能直接使用> <，需要使用compareTo方法
        System.out.println("abc".compareTo("abc")); //0（等于0） 前后一致
        System.out.println("abcd".compareTo("abce")); //-1（小于0） 前小后大
        System.out.println("abce".compareTo("abcd")); //1（大于0） 前大后小

        // 3（掌握）. boolean char.contains(CharSequence s)
        // 判断前面的字符串中是否包含后面的子字符串
        System.out.println("HelloWorld.java".contains("java"));
        System.out.println("http://www.bardu.com".contains("https"));

        // 4（掌握）. boolean char.endsWith(String suffix)
        // 判断当前字符串是否以某个字符串结尾
        System.out.println("test.txt".endsWith(".java"));
        System.out.println("test.txt".endsWith(".txt"));
        System.out.println("asdhuidwdkjsbcscs;ka;".contains("a;"));

        // 5（掌握）. boolean char.equals(Object anObject)
        // 比较两个字符串必须使用equals方法，不能使用”==“
        // equals方法底层有没有调用compareTo方法？新的JDK没有调用
        // equals只能看出相等不相等
        // compareTo方法可以看出是否相等，并且同时还可以看出谁大谁小
        System.out.println("abc".equals("abc")); //true
        System.out.println("abc".equals("ABC")); //false

        // 6（掌握）. boolean char.equalsIgnoreCase(String anotherString)
        // 判断两个字符串是否相等，并且同时忽略大小写
        System.out.println("abc".equalsIgnoreCase("ABC")); //true

        // 7（掌握）. byte[] char.getBytes()
        // 将字符串对象转换成字符串数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + " "); // 97 98 99
        }
        System.out.println();

        // 8（掌握）. int char.indexOf(String str)
        // 判断某个子字符串在当前字符串第一次出现处的索引
        System.out.println("oraclejavac++.netc#phppythonjava".indexOf("java")); //6

        // 9（掌握）. boolean char.isEmpty()
        // 判断某个字符串是否为空
        System.out.println("".isEmpty()); //true
        System.out.println("abc".isEmpty()); //false

        // 10（掌握）. int char.length()
        // 面试题：判断数组长度和判断字符串长度不一样
        // 判断数组长度是Length属性，判断字符串长度是length()方法
        System.out.println("abc".length()); //3
        System.out.println("".length()); //0

        // 11（掌握）. int char.lastIndexOf(String str)
        // 判断某个子字符串在当前字符串中最后一次出现的索引（下标）
        System.out.println("oraclejavac++.netc#phppythonjavaphpsqlhive".lastIndexOf("java")); //28

        // 12（掌握）. String char.replace(CharSequence target, (CharSequence replacement)
        // String的父接口就是：CharSequence
        String s = "http://www.baidu.com";
        String newS = s.replace("http", "https");
        System.out.println(newS); //https://www.baidu.com

        // 把以下字符中的“=”都替换成“：”
        String s1 = "name=zhangsan&age=18&pw=123456";
        String newS1 = s1.replace("=", ":");
        System.out.println(newS1);

        // 13（掌握）. String[] char.split(String regex)
        // 拆分字符串
        String[] strs = "2026-03-05".split("-");
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + " "); // 2026 03 05
        }
        System.out.println();
        String param = "name=zhangsan&age=18&pw=123456";
        String[] params = param.split("&");
        for (int i = 0; i < params.length; i++) {
            System.out.print(params[i] + " "); //name=zhangsan age=18 pw=123456
            // 可以据徐向下拆分，可以根据“=”进行拆分
        }
        System.out.println();
    }
}
