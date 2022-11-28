package lesson7.task3;

public class Line extends IsParallel {
    private final Point first;
    private final Point second;


    public Line(Point first, Point second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isParallel(Line line) {
        return (line.second.getX() - line.first.getX()) / (line.second.getY() - line.first.getY()) ==
                (this.second.getX() - this.first.getX()) / (this.second.getY() - this.first.getY());
    }
}
