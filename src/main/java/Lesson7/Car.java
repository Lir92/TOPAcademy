package Lesson7;

public class Car {

    String brand;
    String color;
    int year;

    public Car(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    void startEngine () {
        System.out.println(brand + " " + "завелась(ся)");
    }

    void stopEngine () {
        System.out.println(brand + " " + "заглушен(а)");
    }
}
