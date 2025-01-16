package HolidayTasks.OOP.EasyTask;

public class CreatePersons {
    //Лёгкая
    //Создать класс Person с полями name и age.
    //
    //1. Реализовать методы setName, setAge, getName, getAge.
    //2. Создать несколько объектов и вывести их данные.
    public static void main(String[] args) {

        Person me = new Person("Kirill", 30);
        Person notMe = new Person("Denis", 25);

        System.out.println(me);
        System.out.println(notMe);

    }
}
