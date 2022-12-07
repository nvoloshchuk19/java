package lesson4;

public class Task11 {
    public static void main(String[] args) {
        String msg = "Hello my name is Nazarii";
        String[] arr_msg = msg.split(" ");
        String new_msg = "";
        for (String msg1 : arr_msg) {
            if (msg1.length() < 5) {
                new_msg += msg1 + " ";
            }
        }
        System.out.println(new_msg);
    }
}
