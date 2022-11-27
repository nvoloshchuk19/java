package lesson8.task2;

public class Lion extends Animal implements CanSwim, CanHunt{
    public Lion(int age, int weight) {
        super(age, weight);
    }

    @Override
    String sound() {
        return "Roar";
    }

    @Override
    String eat() {
        return "Omnomnomnom";
    }

    public boolean canRoar(){
        return true;
    }
}
