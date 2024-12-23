package Lesson9;

public class CardPayment extends Payment{
    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Card payment is confirmed");
    }

    @Override
    void confirmPayment() {
        System.out.println("Payment by card on sum " + amount + " is confirmed");
    }
}
