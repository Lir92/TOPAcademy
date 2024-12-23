package Lesson9.HomeWork9Interfaces;

public abstract class Transport implements Vehicle{
    private String model;
    private int speed;

    public Transport(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public void start() {
        System.out.println("��������� " + this.model + " �������");
    }

    @Override
    public void stop() {
        System.out.println("��������� " + this.model + " ����������");
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    public String getModel(){return this.model;}

    public abstract void refuel(int distance);
}
