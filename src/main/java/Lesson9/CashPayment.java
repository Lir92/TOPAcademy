package Lesson9;

public class CashPayment extends Payment{
    public CashPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Cash payment is confirmed");
    }

    @Override
    void confirmPayment() {
        System.out.println("Payment by cash on sum " + amount + " is confirmed");
    }
}
