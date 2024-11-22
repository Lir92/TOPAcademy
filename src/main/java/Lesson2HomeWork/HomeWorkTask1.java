package Lesson2HomeWork;

import java.util.Scanner;

public class HomeWorkTask1 {
    public static void main(String[] args) {
        // Задача: Написать программу, которая считывает имя и возраст пользователя и выводит их на экран
        Scanner scanner = new Scanner(System.in);
        System.out.println("Привет! как тебя зовут?");
        String name = scanner.nextLine();
        System.out.println("Привет " + name + ". А сколько тебе лет?");
        int age = scanner.nextInt();
        System.out.println(name + ", тебе " + age + " лет");
    }
}
