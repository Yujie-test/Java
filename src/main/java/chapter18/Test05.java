package chapter18;

/*
    equals方法重写的时候要彻底
*/

import java.util.Objects;

public class Test05 {
    public static void main(String[] args) {
        // 多态
        Object o1 = new String();
        Object o2 = new User();
        Object o3 = new Address();

        User u1 = new User("Jack", new Address("Beijing", "Haoyunyuan", "100101"));
        User u2 = new User("Jack", new Address("Beijing", "Haoyunyuan", "100101"));
        System.out.println(u1.equals(u2)); // true

        User u3 = new User("Alice", new Address("Beijing", "Haoyunyuan", "100101"));
        System.out.println(u1.equals(u3)); // false

    }
}

class User{
    // 用户名
    String name;
    // 用户的住址
    Address addr;

    public User() {}
    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    // 重写equals方法
    // 重写规则：当一个用户的用户名和家庭住址都相同，表示同一个用户
    // 这个equals判断的是是User对象和User对象是否相等
    @Override
    public boolean equals(Object o) {
        // 用户名和用户名相同，住址和住址相同的时候，认定是同一个用户
        if (this == o) return true;
        if (o == null || !(o instanceof User)) return false;
        User user = (User) o;
        return this.name.equals(user.name) && this.addr.equals(user.addr);
    }

}
class Address{
    String city;
    String street;
    String zipcode;

    public Address() {}
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    // 注意：这里并没有重写equals方法
    // 这里的equals方法判断的是：Address对象和Address对象是否相等
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Address)) return false;
        // 怎么算家庭住址相同呢？
        // 城市相同，街道相同，邮编相同，表示相同
        Address address = (Address) o;
        return city.equals(address.city) && street.equals(address.street) && zipcode.equals(address.zipcode);
    }
}


