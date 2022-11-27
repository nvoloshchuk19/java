package lesson7.task1;

public class Triangle extends Figure {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double getArea() {
        double perimeter = getPerimeter();
        return Math.sqrt(perimeter*(perimeter-sideA)*(perimeter-sideB)*(perimeter-sideC));
    }

    @Override
    double getPerimeter() {
        return (sideA + sideB + sideC) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
