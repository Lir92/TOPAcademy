package Lesson9;

public class Truck implements Car{

    private String color;

    public Truck(String color) {
        this.color = color;
    }

    @Override
    public void drive() {
        System.out.println("Carries cargoes");
    }

    @Override
    public String getColor() {
        return color;
    }
}
