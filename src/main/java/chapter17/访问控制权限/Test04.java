package chapter17.访问控制权限;

import chapter17.访问控制权限.User;

public class Test04 {
    public static void main(String[] args) {
        User user = new User();
        // age 在 chapter17.访问控制权限.User 中是 protected 访问控制
        //System.out.println(user.age);

        // 错误：“默认”在这里也不行
        // name在chapter17.访问控制权限.User中不是公共的; 无法从外部程序包中对其进行访问
        //System.out.println(user.name);

        // 可以：公开的，在哪都行
        System.out.println(user.weight);
    }
}
