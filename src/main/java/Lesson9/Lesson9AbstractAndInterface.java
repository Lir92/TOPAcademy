package Lesson9;

public class Lesson9AbstractAndInterface {
    /*
    ����������� ������ �� ����� ������� � ������������, ��-�� ���� ��� ������, ������� ��������� ����������� �����
    ������ �������������� ��� ������ ������������ ������.

    ����������� ������ ������������ ����� ������ ����� ������, ��� ����������� ���������������� � �������-�����������.


    =============================
    ����������

    ���������� �� �������� ������ � ������������ - ��� ������ ����������� � �������, ������� ���������� ����������.

    ��������� ����� ������������� �� ���������� ����������� � ��������� ����� ���� ���������.
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
