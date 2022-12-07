package lesson6;

public class Rectangle {
    private final int LENGTH;
    private final int WIDTH;

    public Rectangle(int length, int width) {
        this.LENGTH = length;
        this.WIDTH = width;
    }

    public int getArea(){
        return this.LENGTH * this.WIDTH;
    }

    public int getPerimeter(){
        return 2 * (this.LENGTH * this.WIDTH);
    }

}

