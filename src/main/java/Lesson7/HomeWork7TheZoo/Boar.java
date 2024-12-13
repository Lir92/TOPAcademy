package Lesson7.HomeWork7TheZoo;

public class Boar extends Animal{
    public Boar(String name, String type) {
        super(name, type);
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " " + getName() + " хрюкате");
    }
}
