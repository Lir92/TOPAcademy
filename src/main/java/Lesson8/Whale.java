package Lesson8;

public class Whale extends Cow{

    @Override
    public void printName() {
        System.out.println("Wrong");
        super.printName();
        System.out.println("I am whale");
    }
}
