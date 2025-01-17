package Lesson9.Lesson9Task2;

public class MasterCard extends CreditCard{

    private double balance;

    public MasterCard(int cardNumber, String cardHolderName, double balance) {
        super(cardNumber, cardHolderName);
        this.balance = balance;
    }

    @Override
    public void processPayment(double amount) {
        if(balance < amount) {
            System.out.println("Your MasterCard has not enough money");
        } else {
            balance -= amount;
            System.out.println("Here are your " + amount + ". Your balance " + balance);
        }

    }

    @Override
    public void refundPayment(double amount) {
        balance += amount;
        System.out.println("You've got " + amount + " rubs on your MaterCard" + ". Your balance " + balance);
    }
}
