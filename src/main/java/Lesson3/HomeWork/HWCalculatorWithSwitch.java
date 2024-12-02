package Lesson3.HomeWork;

import java.util.Scanner;

public class HWCalculatorWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число");
        double a = scanner.nextDouble();
//        System.out.println("Введите операцию");
        String operation = scanner.next();
//        System.out.println("Введите второе число");
        double b = scanner.nextDouble();

        switch (operation) {
            case ("+") -> System.out.println(HWCalculatorWithSwitch.sum(a, b));
            case ("-") -> System.out.println(HWCalculatorWithSwitch.subtract(a, b));
            case ("/") -> System.out.println(HWCalculatorWithSwitch.devide(a, b));
            case ("*") -> System.out.println(HWCalculatorWithSwitch.multiply(a, b));
            default -> System.out.println("Неизвестный сивол " + operation);
        }
    }

    public static double sum (double a, double b) {
        return a + b;
    }

    public static double subtract (double a, double b) {
        return a - b;
    }

    public static double devide (double a, double b) {
        return a / b;
    }

    public static double multiply (double a, double b) {
        return a * b;
    }
}
