package HolidayTasks.OOP.MiddleTask;

public class Triangle extends GeometricalFigure{
    private int sideA;
    private int sideB;
    private int sideC;


    public Triangle() {
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int countPerimetr() {
        return sideA + sideB + sideC;
    }

    @Override
    public int countArea() {
        int halfPerimeter = countPerimetr() / 2;
        return (int) Math.sqrt(halfPerimeter * (halfPerimeter-sideA) * (halfPerimeter-sideB) * (halfPerimeter-sideC));
    }
}
