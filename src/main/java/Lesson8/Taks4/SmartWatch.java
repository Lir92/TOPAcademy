package Lesson8.Taks4;

public class SmartWatch extends Product{

    private int batteryLife;
    private int discount = 5;

    public SmartWatch(String name, double price, int batteryLife) {
        super(name, price);
        this.batteryLife = batteryLife;
    }

    public double getDiscountPrice() {
        return super.getDiscountPrice() * 0.95;
    }
}
