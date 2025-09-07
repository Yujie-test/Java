package chapter14;

public class Homework {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.setSize(5);
        v.setSpeed(0);

        System.out.println("The speed of the vehicle is " + v.getSpeed() + ", the size of the vehicle is " + v.getSize());

        // 调用加速方法
        v.speedUp(20);
        System.out.println("Current speed is " + v.getSpeed());
        v.speedUp(40);
        System.out.println("Current speed is " + v.getSpeed());
        v.speedUp(30);
        System.out.println("Current speed is " + v.getSpeed());

        // 调用减速方法
        v.speedDown(20);
        System.out.println("Current speed is " + v.getSpeed());
        v.speedDown(70);
        System.out.println("Current speed is " + v.getSpeed());
    }
}

class Vehicle{
    private double speed;
    private double size;

    public Vehicle() {
    }

    public Vehicle(double speed, double size) {
        this.speed = speed;
        this.size = size;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void move(){
        System.out.println("Vehicle starts to move");
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void speedUp(int addSpeed){
        if (this.getSpeed() + addSpeed > 80){
            System.out.println("Speed limit is 80!");
        } else{
            this.setSpeed(this.getSpeed() + addSpeed);
        }
    }

    public void speedDown(int subSpeed){
        if (this.getSpeed() < subSpeed){
            System.out.println("The speed is slower than what you want to minus!");
        } else {
            this.setSpeed(this.getSpeed() - subSpeed);
        }
    }
}
