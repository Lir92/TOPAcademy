package HolidayTasks.AbstractClassAndInterface.MiddleTask;

import java.util.ArrayList;

public class Main {
    //������� ����������� ����� Shape � �������� getArea � getPerimeter.
    //1. ����������� ��� � ������� Circle, Rectangle.
    //2. ������� ������ ����� � ���������� ��������� �������.

    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Circle circle1 = new Circle(15);
        Circle circle2 = new Circle(2);

        Rectangle rectangle = new Rectangle(2, 8);
        Rectangle rectangle2 = new Rectangle(15, 8);
        Rectangle rectangle3 = new Rectangle(10, 13);

        ArrayList<GeometricalFigure> figures = new ArrayList<>();
        figures.add(circle);
        figures.add(circle1);
        figures.add(circle2);
        figures.add(rectangle);
        figures.add(rectangle2);
        figures.add(rectangle3);

        int totalArea = 0;

        for (GeometricalFigure value: figures) {
            totalArea += value.countArea();
        }

        System.out.println(totalArea);
    }
}
