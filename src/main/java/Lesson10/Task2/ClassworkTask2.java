package Lesson10.Task2;

import java.util.Scanner;

public class ClassworkTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOk = false;
        System.out.println("������� ����� ��� ���������� ����������� �����");

        while (!isOk) {
            try {
                int number = Integer.parseInt(scanner.next());
                if (number < 0) {
                    throw new NegativeNumberException();
                }
                System.out.println("���������� ������ ����� " + number + " = " + Math.sqrt(number));
                isOk = true;
            } catch (NumberFormatException | NegativeNumberException e) {
                System.out.println("�� ����� �� ����� ��� ����� ������ 0, ���������� ��� ���");
                e.printStackTrace();
            } finally {
                System.out.println("��������� ��������� ������� ����������");
            }
        }


    }
}
