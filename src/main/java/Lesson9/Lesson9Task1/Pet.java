package Lesson9.Lesson9Task1;

public abstract class Pet implements Animal{
    private String name;
    private String owner;

    public Pet(String owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public abstract void makeSound();
}
