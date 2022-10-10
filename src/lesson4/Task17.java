package lesson4;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        String[] arr = {"pineapple", "watermelon", "blueberry", "orange", "apple"};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static String[] bubbleSort(String[] arr) {
        String[] new_arr = arr.clone();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                String tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }
        }
        if (Arrays.equals(arr, new_arr)) {
            return arr;
        }
        else {
            bubbleSort(arr);
        }
     return arr;
    }
}

