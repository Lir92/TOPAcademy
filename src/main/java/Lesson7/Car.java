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
        System.out.println(brand + " " + "��������(��)");
    }

    void stopEngine () {
        System.out.println(brand + " " + "��������(�)");
    }
}
