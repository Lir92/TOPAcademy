package Lesson9;

public class DigitalPayment extends Payment{
    public DigitalPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Crypto payment is confirmed");
    }

    @Override
    void confirmPayment() {
        System.out.println("Payment by crypto on sum " + amount + " is confirmed");
    }
}
