package Lesson9.Lesson9Task1;

public class Cat extends Pet{

    public Cat(String owner, String name) {
        super(owner, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Mew-mew");
    }
}
