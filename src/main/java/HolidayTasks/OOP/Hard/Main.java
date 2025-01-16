package HolidayTasks.OOP.Hard;

import java.util.ArrayList;

public class Main {

    //����������� ������� ���������� ������������:
    //1. ������: Employee (�������), Manager (� �������������� ����� ��� ������ ����������).
    //2. ����������� �����, ������������ ����� ������� ���� �����������, ������� ���������� ����������.
    public static void main(String[] args) {

        ArrayList<Manager> allStuff = new ArrayList<>();
        Manager manager = new Manager("Kate", "Manager", 10000);
        Manager manager1 = new Manager("Brian", "Manager", 9500);

        Employee employee1 = new Employee("Carol", "HR", 4000);
        Employee employee2 = new Employee("Steve", "engineer", 5000);
        Employee employee3 = new Employee("John", "janitor", 1500);

        manager.addEmployeeToStuff(employee1);
        manager.addEmployeeToStuff(employee2);

        manager1.addEmployeeToStuff(employee3);

        allStuff.add(manager);
        allStuff.add(manager1);
        System.out.println(countTotalSalary(allStuff));

    }

    public static int countTotalSalary(ArrayList<Manager> managers) {
        int sum = 0;
        for (Manager value: managers) {
            sum += value.countStuffSalary() + value.getSalary();
        }
        return sum;
    }
}
