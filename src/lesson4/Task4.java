package lesson4;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int element = 6;
        boolean status = false;
        for (int elem : arr) {
            if (elem == element) {
                status = true;
                break;
            }
        }
        if (status){
            System.out.println("Array contains element " + element);
        }
        else {
            System.out.println("Array doesn't contain an element " + element);
        }
    }
}
