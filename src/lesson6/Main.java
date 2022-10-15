package lesson6;

public class Main {
    public static void main(String[] args) {
        /// Task 1
        System.out.println("********* Task 1 *********");
        Rectangle rectangle = new Rectangle(5, 3);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        /// Task 2
        System.out.println("********* Task 2 *********");
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());

        /// Task 3
        System.out.println("********* Task 3 *********");
        Dog dog = new Dog("Jack", 3, 20);
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Weight: " + dog.getWeight());
        System.out.println("Dog years: " + dog.getDogYears());

        /// Task 4
        System.out.println("********* Task 4 *********");
        Point first_line_first_dot = new Point(1, 1);
        Point first_line_second_dot = new Point(2, 2);
        System.out.println(first_line_first_dot.distance(first_line_second_dot));

        /// Task 5
        System.out.println("********* Task 5 *********");
        Point second_line_first_dot = new Point(2, 1);
        Point second_line_second_dot = new Point(1, 2);
        Line first_line = new Line(first_line_first_dot, first_line_second_dot);
        Line second_line = new Line(second_line_first_dot, second_line_second_dot);
        System.out.println(first_line.isParallel(second_line));
    }
}
