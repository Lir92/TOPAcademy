package HolidayTasks.OOP.MiddleTask;

public class WrongSidesException extends Exception {
    @Override
    public String getMessage() {
        return "Треугольник с такими гранями не может быть построен";
    }
}
