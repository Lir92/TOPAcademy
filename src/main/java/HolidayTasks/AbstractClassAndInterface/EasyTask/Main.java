package HolidayTasks.AbstractClassAndInterface.EasyTask;

public class Main {

    //������� ��������� Movable � ������� move.
    //1. ����������� ��� � ������ Car � Bicycle.
    //2. ������� �������� ����������� ��������.
    public static void main(String[] args) {
        Movable car = new Car();
        Movable bicycle = new Bicycle();
        car.move();
        bicycle.move();
    }
}
