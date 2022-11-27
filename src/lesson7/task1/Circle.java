package lesson7.task1;

public class Circle extends Figure{
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 2 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
