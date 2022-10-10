package lesson4;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 5, 5, 2, 2, 1};
        String result = "";
        for (int j : arr) {
            if (result.contains(String.valueOf(j))) {
                continue;
            }
            result += j + " ";

        }
        System.out.println(Arrays.toString(result.split(" ")));
    }
}
