package Lesson9;

public class Lesson9AbstractAndInterface {
    /*
    Абстрактные классы не имеют методов с реализациями, из-за чего все классы, которые наследуют абстрактный класс
    должны переопределять все методы абстрактного класса.

    Абстрактные классы используются имеет только общие методы, все особенности переопределяются в классах-наследниках.


    =============================
    Интерфейсы

    Интерфейсы не содержат методы с реализациями - все методы реализуются в классах, которые используют интерфейсы.

    Интерфейс может наследоваться от нескольких интерфейсов И родителей может быть несколько.
     */
    public static void main(String[] args) {
//        Payment cash = new CashPayment(100);
//        Payment card = new CardPayment(2500);
//        Payment crypto = new DigitalPayment(100500);
//
//        cash.processPayment();
//        cash.confirmPayment();
//
//        card.processPayment();
//        card.confirmPayment();
//
//        crypto.processPayment();
//        crypto.confirmPayment();


        Car sport = new Sportcar("red");
        Car truck = new Truck("black");

        System.out.println(sport.getColor());
        sport.drive();

        System.out.println(truck.getColor());
        truck.drive();
    }

}
