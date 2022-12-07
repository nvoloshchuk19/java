package lesson7.task2;

public class Horse extends Animal {
    @Override
    public String talk() {
        return "Horse talks";
    }

    @Override
    public String eat() {
        return "Horse eats";
    }

    @Override
    public String run() {
        return "Horse runs";
    }

    @Override
    public String sleep() {
        return "Horse sleeps";
    }
}
