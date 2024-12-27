package Lesson10.Task1;

public class ExceptionsTask1 {
    public static void main(String[] args) {
        String number1 = "21";
        String number2 = "21a";

        System.out.println(parseInteger(number1));
        System.out.println(parseInteger(number2));

    }

    public static int parseInteger (String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException nfe) {
            return -1;
        } finally {
            System.out.println("Завершение метода parseInteger");
        }
    }
}
