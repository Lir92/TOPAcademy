package HolidayTasks.OOP.Hard;

import java.util.ArrayList;

public class Main {

    //Реализовать систему управления сотрудниками:
    //1. Классы: Employee (базовый), Manager (с дополнительным полем для списка подчинённых).
    //2. Реализовать метод, возвращающий сумму зарплат всех сотрудников, включая подчинённых менеджеров.
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
