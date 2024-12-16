package Lesson8.Taks4;

public class Laptop extends Product{

    private String processorType;
    private int discount = 15;

    public Laptop(String name, double price, String processorType) {
        super(name, price);
        this.processorType = processorType;
    }

    public Laptop(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    public double getDiscountPrice() {
        return super.getDiscountPrice() * 0.85;
    }
}
