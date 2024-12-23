package Lesson9.Lesson9Task2;

public abstract class CreditCard implements PaymentMethod {

    private int cardNumber;
    private String cardHolderName;

    public CreditCard(int cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    @Override
    public abstract void processPayment(double amount);

    @Override
    public abstract void refundPayment(double amount);
}
