package chapter17.访问控制权限;

public class Test01 {
    public static void main(String[] args) {
        User user = new User();
        // 错误：id 在 chapter17.访问控制权限.User 中是 private 访问控制
        //System.out.println(user.id);
        System.out.println(user.age);
        System.out.println(user.name);
        System.out.println(user.weight);
    }
}
