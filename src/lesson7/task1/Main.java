package lesson7.task1;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Figure rectangle = new Rectangle(3, 5);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Figure triangle = new Triangle(3,4,5);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }

}
