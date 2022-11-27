package lesson8.task2;

public class Fish extends Animal implements CanSwim{
    public Fish(int age, int weight) {
        super(age, weight);
    }

    @Override
    String sound() {
        return "fish sound";
    }

    @Override
    String eat() {
        return "Omnomnomnom";
    }

    public boolean breathUnderWater(){
        return true;
    }
}
