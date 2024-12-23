package Lesson9.Lesson9Task1;

import java.sql.SQLOutput;

public class Main {

    /*
    Создайте программу для управления зоомагазином. У вас есть интерфейс Animal который имеет методы getName() и makeSound().
    Создайте абстрактный класс Pet, реализующий интерфейс Animal
    и добавляющий метод getOwner(). На основе этого абстрактного класса создайте классы Dog и Cat.
     */
    public static void main(String[] args) {
        Pet dog = new Dog("Kirill", "Richi");
        Pet cat = new Cat("Vasya", "Barsik");

        System.out.println("Кто хозяин собаки?");
        System.out.println("Хозяин собаки " + dog.getOwner());
        System.out.println(dog.getName() + " - голос!");
        dog.makeSound();

        System.out.println("Чей кот гуляет на улице?");
        System.out.println(cat.getOwner() + " завёл себе кота - ");
        cat.makeSound();

    }
}
