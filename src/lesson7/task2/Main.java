package lesson7.task2;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        System.out.println(lion.talk());
        Animal mouse = new Mouse();
        System.out.println(mouse.eat());
        Animal horse = new Horse();
        System.out.println(horse.sleep());
        Animal python = new Python();
        System.out.println(python.run());
    }
}
