package Lesson7.HomeWork7TheZoo;

public class Monkey extends Animal{
    public Monkey(String name, String type) {
        super(name, type);
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " " + getName() + " кричит");
    }
}
