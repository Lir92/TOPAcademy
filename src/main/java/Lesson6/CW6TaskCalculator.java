package Lesson6;

public class CW6TaskCalculator {
    public static void main(String[] args) {
        printMessage();
        int x = 5;
        int y = 10;
        System.out.println("sum = " + add(x, y));
        System.out.println("sum = " + substract(x, y));
    }

    public static int add (int x, int y) {
        return x + y;
    }

    public static int substract (int x, int y) {
        return x - y;
    }

    public static void printMessage () {
        System.out.println("Calculator is ready to use");;
    }
}
