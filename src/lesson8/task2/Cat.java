package lesson8.task2;

public class Cat extends Animal implements CanSwim, CanHunt {
    public Cat(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String sound() {
        return "Meow";
    }

    @Override
    public String eat() {
        return "Omnomnomnom";
    }

    public boolean landOnAllFours() {
        return true;
    }
}
