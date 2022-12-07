package lesson4;

public class Task15 {
    public static void main(String[] args) {
        String msg = "Hello Hello my name is Nazarii Nazarii";
        msg = msg.replaceAll("[.,!?/]", "");
        String[] arr_msg = msg.split(" ");
        String result = "";

        for (int i = 0; i < arr_msg.length; i++) {
            int count = 0;
            if (result.contains(arr_msg[i])) {
                continue;
            }
            result += arr_msg[i];
            for (int j = 0; j < arr_msg.length; j++) {
                if (arr_msg[i].equals(arr_msg[j])) {
                    count++;
                }
            }
            result += " - " + count + " time(s)\n";
        }
        System.out.println(result);
    }
}
