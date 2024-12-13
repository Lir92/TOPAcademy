package Lesson7.HomeWork7TheZoo;

public class Zoo {
    public static void main(String[] args) {

        Monkey monkey = new Monkey("Муфаса", "Обезбяна");
        Lion lion = new Lion("Симба", "Лев");
        Boar boar = new Boar("Пумба", "Кабан");
        monkey.displayInfo();
        lion.displayInfo();
        boar.displayInfo();

        monkey.makeSound();
        lion.makeSound();
        boar.makeSound();

    }
}
