package Lesson8.Task3;

public class Main {
    /*
    Сложная задача: Устройства

1. Создайте класс Device с методом start(), который выводит "Device is starting".

2. Создайте классы Phone и Laptop, которые наследуют Device:

Для Phone: метод start() должен выводить "Phone is booting up".

Для Laptop: метод start() должен выводить "Laptop is starting its OS".

3. Создайте массив устройств и вызовите метод start() для каждого из них.

4. Расширьте функционал: добавьте метод specs() для каждого класса, который выводит описание устройства.
     */
    public static void main(String[] args) {
        Device[] devices = {new Laptop(), new Phone(), new Laptop(), new Phone()};

        for (Device value: devices) {
            value.start();
            value.specs();
        }
    }
}
