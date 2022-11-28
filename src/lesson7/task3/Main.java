package lesson7.task3;

public class Main {
    public static void main(String[] args) {
        Point firstLineFirstDot = new Point(1, 1);
        Point firstLineSecondDot = new Point(2, 2);
        Point secondLineFirstDot = new Point(2, 1);
        Point secondLineSecondDot = new Point(1, 2);
        Line firstLine = new Line(firstLineFirstDot, firstLineSecondDot);
        Line secondLine = new Line(secondLineFirstDot, secondLineSecondDot);
        System.out.println(firstLine.isParallel(secondLine));
    }
}
