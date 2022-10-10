package lesson4;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] first_arr = {2, 5, 1, 4, 3, 8, 7, 6};
        int[] second_arr = {4, 2, 6, 7, 1, 2, 0};
        String common = "";
        for (int i: first_arr){
            for (int j:second_arr){
                if (i==j){
                    common = common + " " + i;
                    break;
                }
            }
        }
        System.out.println("First array: " + Arrays.toString(first_arr));
        System.out.println("Second array: " + Arrays.toString(second_arr));
        System.out.println("Common: " + common);
    }
}
