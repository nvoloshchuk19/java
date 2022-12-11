package lesson17.task4;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s = "Hello World World World Ha Hi Hi Hi Hi";
        List<String> s1 = new ArrayList<>(Arrays.asList(s.split(" ")));
        System.out.println(s1.stream().distinct().count());
        System.out.println(s1.stream().filter(word -> word.length() < 3).count());
        s1.stream().filter(word -> word.length() % 2 == 0).map(word -> new StringBuilder(word).reverse()).forEach(System.out::println);
        Map<String, Integer> ao = s1.stream().distinct().map(String::toUpperCase).map(word -> word.replaceAll("[AO]", "#")).collect(Collectors.toMap(word -> word, String::length));
        ao.entrySet().forEach(System.out::println);
    }
}
