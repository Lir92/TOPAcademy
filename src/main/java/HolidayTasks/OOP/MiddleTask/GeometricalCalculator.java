package HolidayTasks.OOP.MiddleTask;

import HolidayTasks.AbstractClassAndInterface.MiddleTask.Circle;

import javax.xml.transform.Source;
import java.util.Scanner;

public class GeometricalCalculator {
    //�������
    //
    //������� ����� Rectangle:
    //1. ����������� ������ ��� ���������� ������� � ���������.
    //2. ������� ���������� Square, ������� �������������� ������ ��� ���������.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("����� ������ �� ������ ���������? " +
                "\n1 - �������������," +
                "\n2 - �������," +
                "\n3 - �����������," +
                "\n4 - ����");

        int figure = scanner.nextInt();
        switch (figure) {
            case 1:
                Rectangle rectangle = new Rectangle();
                System.out.print("������� ����� ������: " +
                        "\n����� - ");
                rectangle.setLength(scanner.nextInt());
                System.out.print("������ - ");
                rectangle.setWidth(scanner.nextInt());
                System.out.println("������������� �� ��������� " + rectangle.getLength() + " � " + rectangle.getWidth() + " ��������. " +
                        "\n�� ������ ��������� ��������� ������:" +
                        "\n1 - �������" +
                        "\n2 - ��������");
                int whatToCount = scanner.nextInt();
                if(whatToCount == 1) {
                    System.out.println("������� �������������� = " + rectangle.countArea());
                } else {
                    System.out.println("�������� �������������� = " + rectangle.countPerimetr());
                }
                scanner.close();
                break;
            case 2:
                Rectangle square = new Rectangle();
                System.out.print("������� ����� ������: " +
                        "\n����� - ");
                square.setLength(scanner.nextInt());
                System.out.print("������ - ");
                square.setWidth(scanner.nextInt());
                System.out.println("������� �� ��������� " + square.getLength() + " � " + square.getWidth() + " ��������. " +
                        "\n�� ������ ��������� ��������� ������:" +
                        "\n1 - �������" +
                        "\n2 - ��������");
                whatToCount = scanner.nextInt();
                if(whatToCount == 1) {
                    System.out.println("������� �������� = " + square.countArea());
                } else {
                    System.out.println("�������� �������� = " + square.countPerimetr());
                }
                scanner.close();
                break;
            case 3:
                Triangle triangle = new Triangle();
                System.out.print("������� ����� ������: " +
                        "\n������� � - ");
                triangle.setSideA(scanner.nextInt());
                System.out.print("������� B - ");
                triangle.setSideB(scanner.nextInt());
                System.out.print("������� � - ");
                triangle.setSideC(scanner.nextInt());
                while (triangle.getSideA() + triangle.getSideB() < triangle.getSideC()
                        || triangle.getSideC() + triangle.getSideB() < triangle.getSideA()
                        || triangle.getSideA() + triangle.getSideC() < triangle.getSideB()) {
                    System.out.println("����������� � ������ ��������� �� ����� ���� ��������. ������� ������ ��� ���.");
                    System.out.print("������� � - ");
                    triangle.setSideA(scanner.nextInt());
                    System.out.print("������� B - ");
                    triangle.setSideB(scanner.nextInt());
                    System.out.print("������� � - ");
                    triangle.setSideC(scanner.nextInt());
                }
                System.out.println("����������� �� ��������� " + triangle.getSideA() + ", " + triangle.getSideB()
                        + " � " + triangle.getSideC() + " ��������. " +
                        "\n�� ������ ��������� ��������� ������:" +
                        "\n1 - �������" +
                        "\n2 - ��������");
                whatToCount = scanner.nextInt();
                if(whatToCount == 1) {
                    System.out.println("������� ������������ = " + triangle.countArea());
                } else {
                    System.out.println("�������� ������������ = " + triangle.countPerimetr());
                }
                scanner.close();
                break;
            case 4:
                Circle circle = new Circle();
                System.out.println("������� ������ ����������: ");
                circle.setRaduis(scanner.nextInt());
                System.out.println("���� � �������� " + circle.getRaduis() + " ��������." +
                        "\n�� ������ ��������� ��������� ������:" +
                        "\n1 - �������" +
                        "\n2 - ��������");
                whatToCount = scanner.nextInt();
                if(whatToCount == 1) {
                    System.out.println("������� ����� = " + circle.countArea());
                } else {
                    System.out.println("�������� ����� = " + circle.countPerimetr());
                }
                scanner.close();
                break;
        }




//        Rectangle myRectangle = new Rectangle();
//        System.out.println("������� �������������� �� ��������� " + myRectangle.getWidth() + " � " + myRectangle.getLength()
//                + " = " + myRectangle.countArea());
//        Rectangle square = new Rectangle();
//        System.out.println("������� �������� �� �������� " + square.getWidth() + " = " + square.countArea());
//
//        try {
//            Triangle triangle = new Triangle(4, 5, 4);
//            System.out.println("������� ������������ �� ��������� " + triangle.getSideA() + ", " + triangle.getSideB() + " � " + triangle.getSideC()
//                    + " = " + triangle.countArea());
//        } catch (WrongSidesException e) {
//            e.printStackTrace();
//        }
//
//        Circle circle = new Circle(10);
//        System.out.println("������� ����� � �������� " + circle.getRaduis() + " = " + circle.countArea());
    }
}
