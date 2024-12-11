package Lesson6;

public class CW6TaskBankAccount {
    static double balance = 0;
    public static void main(String[] args) {

        double income = 500;
        double expense = 400;
        deposit(balance, income);
        withdraw(balance, expense);
        System.out.println(balance);
        System.out.println("your balance is - " + getBalance(balance));
    }

    public static double getBalance(double money) {
        return balance;
    }

    public static void deposit (double money, double income) {
        balance = money + income;
    }

    public static double withdraw (double money, double expense) {
        if(balance > expense) {
            balance = money - expense;
            return balance;
        } else {
            System.out.println("Insufficient funds - " + balance);
            return balance;
        }
    }
}
