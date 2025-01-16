package HolidayTasks.OOP.Hard;

import java.util.ArrayList;

public class Manager extends Employee{

    private ArrayList<Employee> stuff = new ArrayList<>();

    public Manager(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addEmployeeToStuff(Employee employee) {
        stuff.add(employee);
    }

    public ArrayList<Employee> getStuff() {
        return stuff;
    }

    public int countStuffSalary () {
        int totalStuffSalary = 0;
        for(Employee value: stuff) {
            totalStuffSalary += value.getSalary();
        }
        return totalStuffSalary;
    }
}
