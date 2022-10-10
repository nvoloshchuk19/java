package lesson4;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 2, 6};
        int min_value = arr[0], max_value = arr[0], average = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min_value > arr[i]){
                min_value = arr[i];
            }
            if (max_value < arr[i]){
                max_value = arr[i];
            }
        }
        for (int j : arr) {
            if (j == min_value || j == max_value) {
                continue;
            }
            average += j;
        }
        System.out.println("Result: " + average / (arr.length - 2));

    }
}
