package Lesson8.Task1;

public class Main {
    /*
    ������� ������: ������������ ��������

1. �������� ������� ����� Vehicle � ������� move(), ������� ������� ��������� "Vehicle is moving".

2. �������� ������ Car � Bicycle, ������� ����������� �� Vehicle.

3. �������������� ����� move() � ������ �� �������:

��� Car: �������� "Car is driving on the road".

��� Bicycle: �������� "Bicycle is pedaling on the path".

4. �������� ������ �������� Vehicle � �������� ����� move() ��� ������� �������.
     */
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Bicycle(), new Car(), new Bicycle(), new Car()};
        for (Vehicle value: vehicles) {
            value.move();
        }
    }

}
