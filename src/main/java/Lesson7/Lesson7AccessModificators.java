package Lesson7;

public class Lesson7AccessModificators {
    static int a; // ���������� ������. � ��� ����� ���������� � ����� ������ �������� ������

    // ������������ ���������: public, protective, private
    // default - ��������� � ������ ������
    // public - ����� ���������� �� ������ ����� � ���������
    // private - ����� �������� ������ �� ������, ��� �� ��������
    // protective - ��������� � ������ ������ � ������� �����������

    // ������������ - ������� ����� / ���������� ������ ��� �������������. ��������� � ��������� � ���������� ��������
    // ����� ������� � �������.

    public static void main(String[] args) {
//        int b = 0; // ��������� ����������
//        Lesson7AccessModificators.a = 5; // ��������� � ���������� ������ �� ������� ������

        Dog sharik = new Dog();
//        Dog tuzik = new Dog();
//        sharik.name = "�����";
//        sharik.eat();
//        sharik.bark();
//        sharik.sleep();
//        tuzik.bark();

        Cat murzik = new Cat();
        murzik.name = "������";
        murzik.eat();
        murzik.sound();
        murzik.sleep();
        murzik.setAge(100);
        System.out.println(murzik.getAge());

//        Car vw = new Car("Volkswagen", "blue", 1999);
//        vw.startEngine();


    }
}
