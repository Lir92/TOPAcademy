package Lesson9;

public abstract class Payment {

    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    void processPayment() {
        System.out.println("Payment is confirmed");
    }

    void confirmPayment() {
        System.out.println("Payment on sum " + amount + " is confirmed");
    }
}
