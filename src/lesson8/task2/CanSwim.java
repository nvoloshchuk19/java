package lesson8.task2;

public interface CanSwim {
    default String swim() {
        return "Can swim";
    }
}
