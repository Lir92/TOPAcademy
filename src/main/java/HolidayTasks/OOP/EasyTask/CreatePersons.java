package HolidayTasks.OOP.EasyTask;

public class CreatePersons {
    //˸����
    //������� ����� Person � ������ name � age.
    //
    //1. ����������� ������ setName, setAge, getName, getAge.
    //2. ������� ��������� �������� � ������� �� ������.
    public static void main(String[] args) {

        Person me = new Person("Kirill", 30);
        Person notMe = new Person("Denis", 25);

        System.out.println(me);
        System.out.println(notMe);

    }
}
