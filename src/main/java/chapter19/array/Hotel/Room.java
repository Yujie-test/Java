package chapter19.array.Hotel;

import java.util.Objects;

public class Room {

    /*
    * 房间编号
    * 1楼：101 102 103 104 105 106
    * 2楼：201 202 203 204 205 206
    * 3楼：301 302 303 304 305 306
    * ...
    * */
    private int roomNo;
    /*房间类型：标准间、单人间、总统套房*/
    private String type;
    /*房间状态
    * ture表示空闲，房间可以被预定
    * false表示占用，房间不能被占用
    * */
    private boolean status;

    // 构造方法
    public Room() {
    }

    public Room(int roomNo, String type, boolean status) {
        this.roomNo = roomNo;
        this.type = type;
        this.status = status;
    }

    // getter and setter
    public int getRoomNo() {
        return roomNo;
    }

    public String getType() {
        return type;
    }

    // IDEA工具对于boolean类型的变量，生成get方法的方法名是：isXxx()
    // 如果你不喜欢，可以修改为getXxx()
    public boolean getStatus() {
        return status;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // equals方法重写
    // equals是用来比较两个对象是否相同的
    // 至于怎么比较，这个还是程序员自己定
    // 你认为两个房间的编号相同，就表示同一个房间，那么你写代码比较房间编号就行
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        // 当前房间编号等于传过来的房间对象的房间编号。认为是同一个房间
        return roomNo == room.roomNo;
    }

    // toString方法重写
    // toString方法的目的就是将java对象转换成字符串形式
    // 怎么转，转换成什么格式，程序员自己定。目的就是：简单、清晰明了
    // 我不要看对象内存地址。我要看具体的信息
    @Override
    public String toString() {
        // return “【101，单人间，占用】”
        // return “【102，单人间，空闲】” // 写死了

        // 动态
        return "[" +
                roomNo +
                ", " + type +
                ", " + (status ? "Empty" : "Occupied") +
                ']';
    }

    // 编写一个临时程序测试一下
    // 一会可以删除这个main方法
    /*public static void main(String[] args) {
        Room room1 = new Room(101, "single", true);
        Room room2 = new Room(201, "single", true);
        Room room3 = new Room(101, "single", false);

        //System.out.println(room1.toString());
        // room是一个引用
        // println(引用)，会自动调用引用的toString()方法
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);

        System.out.println(room1.equals(room2));
        System.out.println(room1.equals(room3));
    }*/
}
