package lesson8.task2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(5, 3);
        System.out.println(cat.eat());
        System.out.println(cat.sound());
        System.out.println(cat.landOnAllFours());

        Dog dog = new Dog(8, 20);
        System.out.println(dog.eat());
        System.out.println(dog.sound());
        System.out.println(dog.growl());

        Dove dove = new Dove(1, 1);
        System.out.println(dove.eat());
        System.out.println(dove.sound());
        System.out.println(dove.shakeHead());

        Fish fish = new Fish(1, 1);
        System.out.println(fish.eat());
        System.out.println(fish.sound());
        System.out.println(fish.breathUnderWater());

        Lion lion = new Lion(4, 100);
        System.out.println(lion.eat());
        System.out.println(lion.sound());
        System.out.println(lion.canRoar());

        System.out.println(dove.equals(lion));
    }
}
