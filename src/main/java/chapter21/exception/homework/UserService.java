package chapter21.exception.homework;

/*
    用户业务类，处理用户相关的业务：例如登陆、注册等功能。
 */

public class UserService {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserService() {
    }

    public UserService(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * 用户注册
     * @param username 用户名
     * @param password 密码
     * @throws UsernameLengthException 当用户名为null，或者用户名长度小于6，或者长度大于14，会出现异常！
     */

    public void register(String username, String password) throws UsernameLengthException {
        /*
            引用等于null的这个判断最好放到所有条件的最前面
            也可以写成null == username
        */
        if (username == null || username.length() > 14 || username.length() < 6){
            throw new UsernameLengthException("用户名长度非法，需要在[6, 14]");
        }
        // 程序能够执行到此处，说明用户名合法
        // else {
        System.out.println("Congratulation you have registered successfully!");
        System.out.println("Welcome " + username + "!");
        //}
    }
}
