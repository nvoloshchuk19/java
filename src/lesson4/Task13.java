package lesson4;

public class Task13 {
    public static void main(String[] args) {
        String alphabet = " abcdefghijklmnopqrstuvwxyz";
        String msg = "Hello/ my 12312name. is Nazariiфафффяфя";
        String new_msg = "";
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == ' ') {
                new_msg += " ";
                continue;
            }
            int index = alphabet.indexOf(msg.toLowerCase().charAt(i));
            if (index == -1) {
                new_msg += "*.";
                continue;
            }
            new_msg += index + ".";
        }
        System.out.println(new_msg);
    }
}
