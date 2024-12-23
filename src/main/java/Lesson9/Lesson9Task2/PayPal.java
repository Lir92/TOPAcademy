package Lesson9.Lesson9Task2;

public class PayPal extends CreditCard implements ElectronicWallet, PaymentMethod{

    private double balance;

    public PayPal(int cardNumber, String cardHolderName, double balance) {
        super(cardNumber, cardHolderName);
        this.balance = balance;
    }

    @Override
    public void addFunds(double amount) {
        balance += amount;
        System.out.println("Your balance " + balance);
    }

    @Override
    public void withdrawFunds(double amount) {
        if(balance < amount) {
            System.out.println("Your PayPal valet has not enough money");
        } else {
            balance -= amount;
            System.out.println("Here are your " + amount + ". Your balance " + balance);
        }

    }

    @Override
    public void processPayment(double amount) {
        if(balance < amount) {
            System.out.println("Your PayPal valet has not enough money");
        } else {
            balance -= amount;
            System.out.println("Here are your " + amount + ". Your balance " + balance);
        }
    }

    @Override
    public void refundPayment(double amount) {
        balance += amount;
        System.out.println("You've got " + amount + " rubs on your PayPal valet" + ". Your balance " + balance);
    }
}
