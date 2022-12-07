package lesson4;

public class Task10 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3}, {2, 5, 7}};
        int[][] arr2 = {{1, 2, 3}, {2, 1, 7}};
        boolean var = true;

        for (int i = 0; i < arr1.length; i++) {
            for (int a = 0; a < arr1[i].length; a++) {
                if (arr1[i][a] != arr2[i][a]) {
                    var = false;
                }
            }
        }
        System.out.println(var ? "Similar" : "No");
    }
}
