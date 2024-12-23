package Lesson9.HomeWork9Interfaces;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[] carList = new String[] {"Tesla", "VW Tiguan", "Scoda Fabia", "Toyota Prius", "Range Rover Sport"};
        String[] bike = new String[] {"Harley Davidson", "Suzuki", "Honda", "BMW", "Chopper"};

        Random random = new Random();
        int randDistance = random.nextInt(0, 2000);

        Transport car1 = new Car(carList[random.nextInt(0, 4)], 100);
        Transport bike1 = new Bike(bike[random.nextInt(0, 4)], 150);

        car1.refuel(randDistance);
        bike1.refuel(randDistance);
    }
}
