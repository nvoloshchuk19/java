package lesson8.task2;

import java.util.Objects;

abstract public class Animal {
    private final int age;
    private final int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    abstract String sound();

    abstract String eat();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Animal animal = (Animal) o;
        return age == animal.age && weight == animal.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weight);
    }
}
