package HolidayTasks.AbstractClassAndInterface.MiddleTask;

public class Circle extends GeometricalFigure {
    private int raduis;
    private final double pi = 3.14;

    public Circle(int raduis) {
        this.raduis = raduis;
    }

    public Circle() {
    }

    public int getRaduis() {
        return raduis;
    }

    public void setRaduis(int raduis) {
        this.raduis = raduis;
    }

    @Override
    public int countPerimetr() {
        return (int) (2 * pi * raduis);
    }

    @Override
    public int countArea() {
        return (int) (pi * Math.abs(raduis));
    }
}
