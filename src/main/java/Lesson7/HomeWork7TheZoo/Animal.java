package Lesson7.HomeWork7TheZoo;

public class Animal {

    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void makeSound() {
        System.out.println(type + " " + name +"Издаёт типичный звук");
    }

    public void displayInfo() {
        System.out.println("Это животное " + getType() + ". Его зовут " + getName());
    }
}
