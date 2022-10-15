package lesson6;

public class Circle {
    private final int RADIUS;

    public Circle(int radius) {
        this.RADIUS = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.RADIUS, 2);
    }
}
