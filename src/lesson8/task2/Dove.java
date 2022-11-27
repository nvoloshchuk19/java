package lesson8.task2;

public class Dove extends Animal implements CanFly{
    public Dove(int age, int weight) {
        super(age, weight);
    }

    @Override
    String sound() {
        return "Curlcurlcurl";
    }

    @Override
    String eat() {
        return "Omnomnomnom";
    }

    public boolean shakeHead(){
        return true;
    }
}
