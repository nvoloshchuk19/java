package lesson17.task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("Highload", "High", "Load", "Highload");
        long count = s.stream()
                .filter(word -> word.toLowerCase().contains("high"))
                .count();
        System.out.println(count);
    }
}
