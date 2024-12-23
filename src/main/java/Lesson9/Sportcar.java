package Lesson9;

import Lesson9.Car;

public class Sportcar implements Car {

    private String color;

    public Sportcar(String color) {
        this.color = color;
    }

    @Override
    public void drive() {
        System.out.println("Sport car drives fast");
    }

    @Override
    public String getColor() {
        return color;
    }
}
