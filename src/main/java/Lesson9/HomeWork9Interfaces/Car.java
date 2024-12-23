package Lesson9.HomeWork9Interfaces;

public class Car extends Transport{

    private final int distanceLimitWithoutRefuel = 600;

    public Car(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void refuel(int distance) {
        if(distance < distanceLimitWithoutRefuel) {
            System.out.println("Автомобиль " + getModel() + " может спокойно проехать на одном баке без заправки " + distance + " км");
        } else {
            System.out.println("Автомобиль " + getModel() + " не может проехать на одном баке без заправки " + distance + " км");
        }
    }
}
