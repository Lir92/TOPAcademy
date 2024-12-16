package Lesson8.Taks4;

public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.print(name + " - " + price);
    }

    public double getDiscountPrice() {
        return price;
    }
}
