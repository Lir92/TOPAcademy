package Lesson9.HomeWork9Interfaces;

public class Car extends Transport{

    private final int distanceLimitWithoutRefuel = 600;

    public Car(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void refuel(int distance) {
        if(distance < distanceLimitWithoutRefuel) {
            System.out.println("���������� " + getModel() + " ����� �������� �������� �� ����� ���� ��� �������� " + distance + " ��");
        } else {
            System.out.println("���������� " + getModel() + " �� ����� �������� �� ����� ���� ��� �������� " + distance + " ��");
        }
    }
}
