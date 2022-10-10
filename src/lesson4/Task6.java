package lesson4;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 9, 6, 7, 8, 4};
        int min_value = arr[0], max_value = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min_value > arr[i]){
                min_value = arr[i];
            }
            if (max_value < arr[i]){
                max_value = arr[i];
            }
        }
        System.out.println("Min value: " + min_value + "\n" + "Max value: " + max_value);
    }
}
