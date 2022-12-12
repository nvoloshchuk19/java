package lesson17.task1;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        int[] num =  new Random().ints(5, -10,10).toArray();
        System.out.println(Arrays.toString(num));
        int sum = Arrays.stream(num)
                .filter((number) -> number % 2 != 0)
                .sum();
        System.out.println(sum);
        long count = Arrays.stream(num)
                .filter((number) -> number % 2 == 0)
                .count();
        System.out.println(count);
        int[] positive = Arrays.stream(num)
                .filter((number)-> number>=0)
                .toArray();
        System.out.println(Arrays.toString(positive));
    }
}
