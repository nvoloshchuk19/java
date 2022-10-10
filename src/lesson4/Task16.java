package lesson4;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        String[] arr = {"pineapple", "watermelon", "blueberry", "Orange", "apple"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i].compareToIgnoreCase(arr[j + 1]) > 0) {
                    String tmp = arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}