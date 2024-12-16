package Lesson8.Task2;

public class Main {
    /*
    ������� ������: ��������� ��������

1. �������� ������� ����� Employee � ������� work(), ������� ������� ��������� "Employee is working".

2. �������� ������ Developer � Manager, ����������� �� Employee.

��� Developer ����� work() ������ �������� "Developer is writing code".

��� Manager ����� work() ������ �������� "Manager is organizing the team".

3. �������� ������ ����������� � �������� ����� work() ��� ������� �� ���.
     */
    public static void main(String[] args) {

        Employee[] employees = {new Developer(), new Developer(), new Manager()};
        for(Employee value: employees) {
            value.work();
        }

    }
}
