package lesson7.task2;

public class Mouse extends Animal {
    @Override
    String talk() {
        return "Mouse talks";
    }

    @Override
    String eat() {
        return "Mouse eats";
    }

    @Override
    String run() {
        return "Mouse runs";
    }

    @Override
    String sleep() {
        return "Mouse sleeps";
    }
}
