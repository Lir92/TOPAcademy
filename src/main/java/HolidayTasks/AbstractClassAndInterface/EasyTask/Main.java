package HolidayTasks.AbstractClassAndInterface.EasyTask;

public class Main {

    //Создать интерфейс Movable с методом move.
    //1. Реализовать его в классе Car и Bicycle.
    //2. Вывести описание перемещения объектов.
    public static void main(String[] args) {
        Movable car = new Car();
        Movable bicycle = new Bicycle();
        car.move();
        bicycle.move();
    }
}
