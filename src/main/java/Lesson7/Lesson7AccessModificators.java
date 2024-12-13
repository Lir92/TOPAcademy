package Lesson7;

public class Lesson7AccessModificators {
    static int a; // переменная класса. К ней можно обратиться в любом методе текущего класса

    // модификаторы видимости: public, protective, private
    // default - видимость в рамках пакета
    // public - можно обратиться из любого места в программе
    // private - можно обратить только из класса, где он объявлен
    // protective - видимость в рамках пакета и классов наследников

    // Инкапсуляция - скрытие полей / переменных класса для пользователей. Изменение и обращение к переменным делается
    // через геттеры и сеттеры.

    public static void main(String[] args) {
//        int b = 0; // локальная переменная
//        Lesson7AccessModificators.a = 5; // обращение к переменной класса из другого класса

        Dog sharik = new Dog();
//        Dog tuzik = new Dog();
//        sharik.name = "Шарик";
//        sharik.eat();
//        sharik.bark();
//        sharik.sleep();
//        tuzik.bark();

        Cat murzik = new Cat();
        murzik.name = "Мурзик";
        murzik.eat();
        murzik.sound();
        murzik.sleep();
        murzik.setAge(100);
        System.out.println(murzik.getAge());

//        Car vw = new Car("Volkswagen", "blue", 1999);
//        vw.startEngine();


    }
}
