package Lesson6.HomeWork6;

import java.util.Scanner;

public class HomeWork6BankAccount {
    public static double balance = 600;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose operation:\n" +
                "1 - Get your balance\n" +
                "2 - Deposit\n" +
                "2 - Withdraw\n");

        int operation = scanner.nextInt();
        System.out.println("Insert a sum of money");
        double money = scanner.nextDouble();
        switch (operation) {
            case 1 -> getBalance();
            case 2 -> System.out.println(deposit(money));
            case 3 -> System.out.println(withdraw(money));
        }
    }

    public static void getBalance() {
        System.out.println("Your balance is " + balance);
    }

    public static double deposit (double income) {
        return balance + income;
    }

    public static double withdraw (double withdrawal) {
        if(balance > withdrawal) {
            return balance - withdrawal;
        } else {
            System.out.println("Insufficient funds");
            return balance;
        }
    }
}
