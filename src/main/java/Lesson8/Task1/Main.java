package Lesson8.Task1;

public class Main {
    /*
    Простая задача: Транспортные средства

1. Создайте базовый класс Vehicle с методом move(), который выводит сообщение "Vehicle is moving".

2. Создайте классы Car и Bicycle, которые наследуются от Vehicle.

3. Переопределите метод move() в каждом из классов:

Для Car: выводить "Car is driving on the road".

Для Bicycle: выводить "Bicycle is pedaling on the path".

4. Создайте массив объектов Vehicle и вызовите метод move() для каждого объекта.
     */
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Bicycle(), new Car(), new Bicycle(), new Car()};
        for (Vehicle value: vehicles) {
            value.move();
        }
    }

}
