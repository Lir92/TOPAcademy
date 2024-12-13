package Lesson7;

public class Cat extends Animal{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void sound() {
        System.out.println(name + " м€укает");
    }

    @Override
    void sleep() {
        System.out.println(name + " спит клубком");
    }
}
