package lesson7.task3;

public class Main {
    public static void main(String[] args) {
        Point first_line_first_dot = new Point(1, 1);
        Point first_line_second_dot = new Point(2, 2);
        Point second_line_first_dot = new Point(2, 1);
        Point second_line_second_dot = new Point(1, 2);
        Line first_line = new Line(first_line_first_dot, first_line_second_dot);
        Line second_line = new Line(second_line_first_dot, second_line_second_dot);
        System.out.println(first_line.isParallel(second_line));
    }
}
