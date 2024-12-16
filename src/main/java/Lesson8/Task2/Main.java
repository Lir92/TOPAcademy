package Lesson8.Task2;

public class Main {
    /*
    Средняя задача: Работники компании

1. Создайте базовый класс Employee с методом work(), который выводит сообщение "Employee is working".

2. Создайте классы Developer и Manager, наследуемые от Employee.

Для Developer метод work() должен выводить "Developer is writing code".

Для Manager метод work() должен выводить "Manager is organizing the team".

3. Создайте массив сотрудников и вызовите метод work() для каждого из них.
     */
    public static void main(String[] args) {

        Employee[] employees = {new Developer(), new Developer(), new Manager()};
        for(Employee value: employees) {
            value.work();
        }

    }
}
