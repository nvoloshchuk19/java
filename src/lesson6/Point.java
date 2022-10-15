package lesson6;

public class Point {
    private final double X;
    private final double Y;

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow((point.X - this.X), 2) + Math.pow((point.Y - this.Y), 2));
    }
}
