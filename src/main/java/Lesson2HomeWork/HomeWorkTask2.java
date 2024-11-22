package Lesson2HomeWork;

import java.util.Scanner;

public class HomeWorkTask2 {
    public static void main(String[] args) {
        // Задача: Написать программу, которая считывает число от пользователя и определяет,
        // положительное оно, отрицательное или ноль.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! Напиши число и я угадаю его ^__^");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Ты загадал число " + number);
        } else if (number < 0) {
            System.out.println("Твоё число меньше 0 и это " + number);
        } else {
            System.out.println("Ты загадал число " + number + " и оно больше нуля");
        }
    }
}
