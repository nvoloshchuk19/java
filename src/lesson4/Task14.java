package lesson4;

public class Task14 {
    public static void main(String[] args) {
        String msg = "Helloii myii nameii isii Nazarii";
        String word = "HI";
        String symb = "ii";
        String new_msg = "";
        String[] arr_msg = msg.split(" ");
        for (String wrd: arr_msg) {
            new_msg += wrd + " ";
            if (wrd.endsWith(symb)) {
                new_msg += word + " ";
            }
        }
        System.out.println(new_msg);
    }
}
