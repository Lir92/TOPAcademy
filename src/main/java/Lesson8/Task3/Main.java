package Lesson8.Task3;

public class Main {
    /*
    ������� ������: ����������

1. �������� ����� Device � ������� start(), ������� ������� "Device is starting".

2. �������� ������ Phone � Laptop, ������� ��������� Device:

��� Phone: ����� start() ������ �������� "Phone is booting up".

��� Laptop: ����� start() ������ �������� "Laptop is starting its OS".

3. �������� ������ ��������� � �������� ����� start() ��� ������� �� ���.

4. ��������� ����������: �������� ����� specs() ��� ������� ������, ������� ������� �������� ����������.
     */
    public static void main(String[] args) {
        Device[] devices = {new Laptop(), new Phone(), new Laptop(), new Phone()};

        for (Device value: devices) {
            value.start();
            value.specs();
        }
    }
}
