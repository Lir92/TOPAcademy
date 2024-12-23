package Lesson9.HomeWork9Interfaces;

public class Bike extends Transport{

    private final int distanceLimitWithoutRefuel = 400;

    public Bike(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void refuel(int distance) {
        if(distance < distanceLimitWithoutRefuel) {
            System.out.println("�������� " + getModel() + " ����� �������� �������� �� ����� ���� ��� �������� " + distance + " ��");
        } else {
            System.out.println("�������� " + getModel() + " �� ����� �������� �� ����� ���� ��� �������� " + distance + " ��");
        }
    }
}
