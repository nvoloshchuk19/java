package lesson4;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] new_arr = null;
        int element = 4;
        int k = 0;
        boolean status = false;
        for (int j : arr) {
            if (j == element) {
                new_arr = new int[arr.length - 1];
                for (int elem : arr) {
                    if (elem == element) {
                        continue;
                    }
                    new_arr[k++] = elem;
                }
                status = true;
                break;
            }
        }
        if (status){
            System.out.println("New array: " + Arrays.toString(new_arr));
        }
        else {
            System.out.println("Array doesn't contain an element " + Arrays.toString(arr));
        }
    }
    }
