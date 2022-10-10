package lesson4;


public class Task1 {
    public static void main(String[] args) {
        String text = "Hello, 3,14";
        String tmp = text.replaceAll("(?<=[\\d])(,)(?=[\\d])", ".").replaceAll("[^0-9.]+", " ").replaceAll("^[.,!? ]", "").replaceAll("[.,!? ]$", "");
        System.out.println(Double.parseDouble(tmp));
    }
}
