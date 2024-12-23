package Lesson9.Lesson9Task2;

public class Main {
    /*
    �������� ������� ��� ���������� ���������� ��������� ��������. � ��� ���� ��������� PaymentMethod,
    ������� ���������� ������ processPayment(double amount) � refundPayment(double amount).
    �������� ����������� ����� CreditCard, ����������� PaymentMethod � ����������� ������ getCardNumber() � getCardHolderName().
    �� ������ ����� ������������ ������ �������� ������ VisaCard � MasterCard. ����� �������� ��������� ElectronicWallet
    � �������� addFunds(double amount) � withdrawFunds(double amount) � ���������� ��� � ������ PayPal, ������� ������
    ����� ������������� ��������� PaymentMethod
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
