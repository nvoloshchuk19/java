package lesson4;

public class Task12 {
    public static void main(String[] args) {
        String msg = "Hello my name is Nazarii";
        String[] msg_arr = msg.split(" ");
        String new_msg = "";
        char symb = '#';
        int k = 1;

        for (int i = 0; i < msg_arr.length; i++) {
            if (msg_arr[i].length() >= k) {
                new_msg += msg_arr[i].replace(msg_arr[i].charAt(k - 1), symb) + " ";
                continue;
            }
            new_msg += msg_arr[i] + " ";
        }
        System.out.println(new_msg);
    }


}
