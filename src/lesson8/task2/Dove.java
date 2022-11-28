package lesson8.task2;

public class Dove extends Animal implements CanFly {
    public Dove(int age, int weight) {
        super(age, weight);
    }

    @Override
    public String sound() {
        return "Curlcurlcurl";
    }

    @Override
    public String eat() {
        return "Omnomnomnom";
    }

    public boolean shakeHead() {
        return true;
    }
}
