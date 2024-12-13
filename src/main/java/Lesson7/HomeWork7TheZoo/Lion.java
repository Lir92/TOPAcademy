package Lesson7.HomeWork7TheZoo;

public class Lion extends Animal{
    public Lion(String name, String type) {
        super(name, type);
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " " + getName() + " громко рычит");
    }
}
