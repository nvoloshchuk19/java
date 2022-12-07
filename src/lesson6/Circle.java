package lesson6;

public class Circle {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
