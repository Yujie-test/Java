package chapter19.array.Hotel;

/*
酒店对象，酒店中有二维数组，二维数组模拟大厦*/

public class Hotel {
    private Room[][] hotel;

    // 盖楼通过构造方法来盖楼
    public Hotel() {
        // 一共有几层，每层的房间类型是什么，每个房间的编号是什么
        // 我们可以先写死。一共三层，一层单人间，二楼标准间，三楼套房，每层6个房间
        // 动态初始化
        hotel = new Room[3][6]; // 3行6列。3层楼，每层6个房间

        // 创建18个Room对象，放到数组当中
        for (int i = 0; i < hotel.length; i++) { // i是下标：0 1 2，i+1是楼层：1 2 3
            for (int j = 0; j < hotel[i].length; j++) {
                String type;
                if (i == 0){
                    type = "single";
                } else if (i == 1){
                    type = "standard";
                } else {
                    type = "suite";
                }
                int no = (i+1) * 100 + j+1;
                hotel[i][j] = new Room(no, type, true);
            }
        }
    }

    public Hotel(int floorNum, int roomNum) {
        hotel = new Room[floorNum][roomNum];

        // 创建18个Room对象，放到数组当中
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                int no = (i+1) * 100 + j+1;
                hotel[i][j] = new Room(no, "single", true);
            }
        }
    }

    // 在酒店对象上提供一个打印房间列表的方法
    public void printHotel(){
        // 打印所有房间状态，就是遍历二维数组
        for (int i = 0; i < hotel.length; i++) {
            // 里面for循环负责输出一层
            for (int j = 0; j < hotel[i].length; j++) {
                System.out.print(hotel[i][j] + " ");
            }
            // 换行
            System.out.println();
        }
    }

    /**
     * 订房方法
     * @param roomNo：调用此方法时需要传递一个房间编号过来。这个房间编号是前台小姐姐输入的
     */
    public void order(int roomNo){
        // 订房最主要的是将房间对象的status修改为false
        // 假设房间编号是207（下标是hotel[1][6]）
        // 通过房间编号演算出下标。获取房间编号
        int floor = roomNo / 100 - 1;
        int no = roomNo % 100 - 1;
        if (!hotel[floor][no].getStatus()){
            System.out.println("Order failed, room " + roomNo + " is occupied!");
            return;
        }
        hotel[roomNo / 100 - 1][roomNo % 100 - 1].setStatus(false);
        System.out.println("Order room " + roomNo + " succeed!");
    }

    /**
     * 退房方法
     * @param roomNo
     */
    public void exit(int roomNo){
        int floor = roomNo / 100 - 1;
        int no = roomNo % 100 - 1;
        if (hotel[floor][no].getStatus()){
            System.out.println("Exit failed, room " + roomNo + " is empty!");
            return;
        }
        hotel[roomNo / 100 - 1][roomNo % 100 - 1].setStatus(true);
        System.out.println("Exit Room " + roomNo + " succeed!");
    }
}
