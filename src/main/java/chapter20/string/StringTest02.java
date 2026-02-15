package chapter20.string;

public class StringTest02 {
    public static void main(String[] args) {
        // “hello”是存储在方法区的字符串常量池当中
        // 所以这个“hello”不会新建（因为这个对象已经存在了！）
        String s1 = "hello";
        String s2 = "hello";
        // 分析结果是true还是false
        // == 双等号比较的是不是变量中保存的内存地址？是的
        System.out.println(s1 == s2); //true

        String s3 = new String("xyz");
        String s4 = new String("xyz");
        System.out.println(s3 == s4); //false

        // 通过这个案例的学习，我们知道了，字符串对象之间的比较不能使用“==”
        // “==”不保险，应该调用String类的equals方法
        // String类已经重写了equals方法，以下的equals方法调用的是String重写之后的equals方法
        System.out.println(s3.equals(s4)); //true

        String k = new String("testString");
        // "testString"这个字符串可以后面加“.”呢
        // 因为"testString"是一个String字符串对象，只要是对象都能调用方法
        System.out.println("testString".equals(k)); // 建议使用这种方式，因为这个可以避免空指针异常
        System.out.println(k.equals("testString")); // 存在空指针异常风险，不建议这样写

        String d = null;
        //System.out.println(d.equals("testString")); // NullPointerException
        System.out.println("testString".equals(d)); // false
    }
}
