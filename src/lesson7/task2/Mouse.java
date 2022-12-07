package lesson7.task2;

public class Mouse extends Animal {
    @Override
    public String talk() {
        return "Mouse talks";
    }

    @Override
    public String eat() {
        return "Mouse eats";
    }

    @Override
    public String run() {
        return "Mouse runs";
    }

    @Override
    public String sleep() {
        return "Mouse sleeps";
    }
}
