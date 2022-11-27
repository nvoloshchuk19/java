package lesson7.task2;

public class Horse extends Animal {
    @Override
    String talk() {
        return "Horse talks";
    }

    @Override
    String eat() {
        return "Horse eats";
    }

    @Override
    String run() {
        return "Horse runs";
    }

    @Override
    String sleep() {
        return "Horse sleeps";
    }
}
