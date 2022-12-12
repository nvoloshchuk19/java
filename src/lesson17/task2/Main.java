package lesson17.task2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] s = {"apple", "strawberry", "orange",};
        Comparator<String> comp = (a, b) -> a.length() - b.length();
        Arrays.stream(s)
                .sorted(comp)
                .forEach(System.out::println);
    }
}
