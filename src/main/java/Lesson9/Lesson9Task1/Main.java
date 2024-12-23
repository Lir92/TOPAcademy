package Lesson9.Lesson9Task1;

import java.sql.SQLOutput;

public class Main {

    /*
    �������� ��������� ��� ���������� ������������. � ��� ���� ��������� Animal ������� ����� ������ getName() � makeSound().
    �������� ����������� ����� Pet, ����������� ��������� Animal
    � ����������� ����� getOwner(). �� ������ ����� ������������ ������ �������� ������ Dog � Cat.
     */
    public static void main(String[] args) {
        Pet dog = new Dog("Kirill", "Richi");
        Pet cat = new Cat("Vasya", "Barsik");

        System.out.println("��� ������ ������?");
        System.out.println("������ ������ " + dog.getOwner());
        System.out.println(dog.getName() + " - �����!");
        dog.makeSound();

        System.out.println("��� ��� ������ �� �����?");
        System.out.println(cat.getOwner() + " ���� ���� ���� - ");
        cat.makeSound();

    }
}
