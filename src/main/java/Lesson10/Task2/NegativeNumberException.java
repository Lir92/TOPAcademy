package Lesson10.Task2;

public class NegativeNumberException extends Exception{

    @Override
    public String getMessage() {
        return "Квадратный корень из отрицательного числа не определен";
    }
}
