package lesson8.task2;

public interface CanFly {
    default String fly() {
        return "Can fly";
    }
}
