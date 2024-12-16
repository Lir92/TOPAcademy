package Lesson8.Taks4;

public class Smartphone extends Product {
    private int memorySize;
//    private int discount = 10;

    public Smartphone(String name, double price, int memorySize) {
        super(name, price);
        this.memorySize = memorySize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Memory size - " + memorySize);
    }

    public double getDiscountPrice() {
        return super.getDiscountPrice() * 0.9;
    }
}
