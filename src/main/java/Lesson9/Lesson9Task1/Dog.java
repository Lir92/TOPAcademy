package Lesson9.Lesson9Task1;

public class Dog extends Pet{

    public Dog(String owner, String name) {
        super(owner, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Gaw-gaw");
    }

}
