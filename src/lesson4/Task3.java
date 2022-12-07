package lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int length = scanner.nextInt();
        double[] arr = new double[length];
        for (int l = 0; l < length; l++) {
            System.out.print("Enter " + (l + 1) + " element: ");
            arr[l] = scanner.nextDouble();
        }
        double average = 0;
        for (int i = 0; i < length; i++) {
            average += arr[i];
        }
        System.out.println("Average value: " + average / length);
    }
}
