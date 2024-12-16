package Lesson8.Task3;

public class Laptop extends Device{
    private String name;
    private int processorCoreQuantity;

    @Override
    void start() {
        System.out.println("Laptop is starting its OS");
    }

    void specs() {
        System.out.println("Name: " + name + "; Quantity of processor cores: " + processorCoreQuantity);
    }
}
