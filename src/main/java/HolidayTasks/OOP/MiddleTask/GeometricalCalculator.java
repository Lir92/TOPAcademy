package HolidayTasks.OOP.MiddleTask;

import HolidayTasks.AbstractClassAndInterface.MiddleTask.Circle;

import javax.xml.transform.Source;
import java.util.Scanner;

public class GeometricalCalculator {
    //Средняя
    //
    //Создать класс Rectangle:
    //1. Реализовать методы для вычисления площади и периметра.
    //2. Создать наследника Square, который переопределяет методы для квадратов.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую фигуру вы хотите построить? " +
                "\n1 - прямоугольник," +
                "\n2 - квадрат," +
                "\n3 - треугольник," +
                "\n4 - круг");

        int figure = scanner.nextInt();
        switch (figure) {
            case 1:
                Rectangle rectangle = new Rectangle();
                System.out.print("Введите длины сторон: " +
                        "\nдлина - ");
                rectangle.setLength(scanner.nextInt());
                System.out.print("ширина - ");
                rectangle.setWidth(scanner.nextInt());
                System.out.println("Прямоугольник со сторонами " + rectangle.getLength() + " и " + rectangle.getWidth() + " построен. " +
                        "\nВы можете вычислить следующие данные:" +
                        "\n1 - площадь" +
                        "\n2 - периметр");
                int whatToCount = scanner.nextInt();
                if(whatToCount == 1) {
                    System.out.println("Площадь прямоугольника = " + rectangle.countArea());
                } else {
                    System.out.println("Периметр прямоугольника = " + rectangle.countPerimetr());
                }
                scanner.close();
                break;
            case 2:
                Rectangle square = new Rectangle();
                System.out.print("Введите длины сторон: " +
                        "\nдлина - ");
                square.setLength(scanner.nextInt());
                System.out.print("ширина - ");
                square.setWidth(scanner.nextInt());
                System.out.println("Квадрат со сторонами " + square.getLength() + " и " + square.getWidth() + " построен. " +
                        "\nВы можете вычислить следующие данные:" +
                        "\n1 - площадь" +
                        "\n2 - периметр");
                whatToCount = scanner.nextInt();
                if(whatToCount == 1) {
                    System.out.println("Площадь квадрата = " + square.countArea());
                } else {
                    System.out.println("Периметр квадрата = " + square.countPerimetr());
                }
                scanner.close();
                break;
            case 3:
                Triangle triangle = new Triangle();
                System.out.print("Введите длины сторон: " +
                        "\nсторона А - ");
                triangle.setSideA(scanner.nextInt());
                System.out.print("сторона B - ");
                triangle.setSideB(scanner.nextInt());
                System.out.print("сторона С - ");
                triangle.setSideC(scanner.nextInt());
                while (triangle.getSideA() + triangle.getSideB() < triangle.getSideC()
                        || triangle.getSideC() + triangle.getSideB() < triangle.getSideA()
                        || triangle.getSideA() + triangle.getSideC() < triangle.getSideB()) {
                    System.out.println("Треугольник с такими сторонами не может быть построен. Введите данные ещё раз.");
                    System.out.print("сторона А - ");
                    triangle.setSideA(scanner.nextInt());
                    System.out.print("сторона B - ");
                    triangle.setSideB(scanner.nextInt());
                    System.out.print("сторона С - ");
                    triangle.setSideC(scanner.nextInt());
                }
                System.out.println("Треугольник со сторонами " + triangle.getSideA() + ", " + triangle.getSideB()
                        + " и " + triangle.getSideC() + " построен. " +
                        "\nВы можете вычислить следующие данные:" +
                        "\n1 - площадь" +
                        "\n2 - периметр");
                whatToCount = scanner.nextInt();
                if(whatToCount == 1) {
                    System.out.println("Площадь треугольника = " + triangle.countArea());
                } else {
                    System.out.println("Периметр треугольника = " + triangle.countPerimetr());
                }
                scanner.close();
                break;
            case 4:
                Circle circle = new Circle();
                System.out.println("Введите радиус окружности: ");
                circle.setRaduis(scanner.nextInt());
                System.out.println("Круг с радиусом " + circle.getRaduis() + " построен." +
                        "\nВы можете вычислить следующие данные:" +
                        "\n1 - площадь" +
                        "\n2 - периметр");
                whatToCount = scanner.nextInt();
                if(whatToCount == 1) {
                    System.out.println("Площадь круга = " + circle.countArea());
                } else {
                    System.out.println("Периметр круга = " + circle.countPerimetr());
                }
                scanner.close();
                break;
        }




//        Rectangle myRectangle = new Rectangle();
//        System.out.println("Площадь прямоугольника со сторонами " + myRectangle.getWidth() + " и " + myRectangle.getLength()
//                + " = " + myRectangle.countArea());
//        Rectangle square = new Rectangle();
//        System.out.println("Площадь квадрата со стороной " + square.getWidth() + " = " + square.countArea());
//
//        try {
//            Triangle triangle = new Triangle(4, 5, 4);
//            System.out.println("Площадь треугольника со сторонами " + triangle.getSideA() + ", " + triangle.getSideB() + " и " + triangle.getSideC()
//                    + " = " + triangle.countArea());
//        } catch (WrongSidesException e) {
//            e.printStackTrace();
//        }
//
//        Circle circle = new Circle(10);
//        System.out.println("Площадь круга с радиусом " + circle.getRaduis() + " = " + circle.countArea());
    }
}
