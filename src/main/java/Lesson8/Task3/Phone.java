package Lesson8.Task3;

public class Phone extends Device{
    private String name;
    private int memory;

    @Override
    void start() {
        System.out.println("Phone is booting up");
    }

    void specs() {
        System.out.println("Name: " + name + "; Memory quantity: " + memory);
    }
}
