package Lesson9.Lesson9Task2;

public class Main {
    /*
    Создайте систему для управления различными способами платежей. У нас есть интерфейс PaymentMethod,
    который определяет методы processPayment(double amount) и refundPayment(double amount).
    Создайте абстрактный класс CreditCard, реализующий PaymentMethod и добавляющий методы getCardNumber() и getCardHolderName().
    На основе этого абстрактного класса создайте классы VisaCard и MasterCard. Также создайте интерфейс ElectronicWallet
    с методами addFunds(double amount) и withdrawFunds(double amount) и реализуйте его в классе PayPal, который должен
    также реализовывать интерфейс PaymentMethod
     */

    public static void main(String[] args) {

        PaymentMethod visa = new VisaCard(135212987, "Dave", 900);
        PaymentMethod master = new MasterCard(999011243, "Steve", 0);
        PayPal payPal = new PayPal(1100, "Amy", 12600.8);

        visa.processPayment(700);
        visa.refundPayment(100);

        master.processPayment(150);
        master.refundPayment(1000);

        payPal.addFunds(100);
        payPal.withdrawFunds(1000);
        payPal.processPayment(150);
        payPal.refundPayment(70 );

    }
}
