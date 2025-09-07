package chapter14;

public class Homework3 {
    public static void main(String[] args) {
        MyTime mt = new MyTime(23, 58,20);
        mt.display();

        mt.addSecond(45);
        mt.display();

        mt.addSecond(55);
        mt.display();

        mt.addHour(48);
        mt.display();
    }
}
class MyTime{
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void display(){
        System.out.println("My time is: " + getHour() + "时" + getMinute() + "分" + getSecond() + "秒");
    }

    public void addSecond(int sec){
        if (getSecond() + sec < 60){
            setSecond(getSecond() + sec);
        } else{
            addMinute((getSecond() + sec) / 60);
            setSecond((getSecond() + sec) % 60);
        }
    }

    public void addMinute(int min){
        if (getMinute() + min < 60){
            setMinute(getMinute() + min);
        } else{
            addHour((getMinute() + min) / 60);
            setMinute((getMinute() + min) % 60);
        }
    }

    public void addHour(int hour){
        if (getHour() + hour < 24){
            setHour(getHour() + hour);
        } else{
            System.out.println("It's a new day!");
            setHour((getHour() + hour) % 24);
        }
    }
}
