package Lesson8.Taks4;

public class Main {
    /*
    ������: ������� �����������

�������� ������� ��� ������ � ��������� �����������, � ������� ���� ��������� ���� ���������, ������ �� ������� ����� ����� �������������� �����������.

1. ������� ����� Product:

����: name (�������� ������), price (���� ������).

����� displayInfo() � ������� ���������� � ������.

����� getDiscountPrice() � ���������� ���� � ������ ������ (��� �������� ������ ������ 0%).

2. ������-����������:

Smartphone:

�������������� ����: memorySize (����� ������).

����� displayInfo() � ������� ���������� � ���������, ������� ��� ������.

����� getDiscountPrice() � ������ 10% ��� ����������.

Laptop:

�������������� ����: processorType (��� ����������).

����� displayInfo() � ������� ���������� � ��������, ������� ��� ����������.

����� getDiscountPrice() � ������ 15% ��� ���������.

SmartWatch:

�������������� ����: batteryLife (����� ������ �� ������������).

����� displayInfo() � ������� ���������� � �����-�����, ������� ����� ������ �� ������������.

����� getDiscountPrice() � ������ 5% ��� �����-�����.

3. ����� Cart (������� �������):

������ ��������� � �������.

��������� ����� � �������.

���������� ����� ��������� ���� ������� � ������� � ������ ������.

4. �������� ��������� ������� ������ ����� � �������� �� � �������. ����� �������� ���������� � ������ ������ � �������� ����� �� ��� ������ � �������.
     */

    public static void main(String[] args) {
        Product laptop = new Laptop("Lenovo", 10000, "Ryzen");
        Product smartphone = new Smartphone("Samsung", 5000, 128);
        Product smartWatch = new SmartWatch("Huawei", 2000, 256);

        Cart cart = new Cart();
        cart.addToCart(laptop);
        cart.addToCart(smartphone);
        cart.addToCart(smartWatch);

        System.out.println("Total sum to pay: " + cart.totalPrice());

    }
}
