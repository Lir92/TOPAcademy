package Lesson7.HomeWork7TheZoo;

public class Zoo {
    public static void main(String[] args) {

        Monkey monkey = new Monkey("������", "��������");
        Lion lion = new Lion("�����", "���");
        Boar boar = new Boar("�����", "�����");
        monkey.displayInfo();
        lion.displayInfo();
        boar.displayInfo();

        monkey.makeSound();
        lion.makeSound();
        boar.makeSound();

    }
}
