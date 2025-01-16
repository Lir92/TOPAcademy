package HolidayTasks.AbstractClassAndInterface.MiddleTask;

public class Rectangle extends GeometricalFigure {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle() {
    }

//    public Rectangle(int width) {
//        this.width = width;
//    }

    @Override
    public int countPerimetr() {
        return (length + width) * 2;
    }

    @Override
    public int countArea() {
        return length * width;
    }
}
