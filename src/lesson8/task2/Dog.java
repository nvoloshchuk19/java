package lesson8.task2;

public class Dog extends Animal implements CanSwim, CanHunt {
    public Dog(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String sound() {
        return "Bark";
    }

    @Override
    public String eat() {
        return "Omnomnomnom";
    }

    public boolean growl() {
        return true;
    }
}
