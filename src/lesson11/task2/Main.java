package lesson11.task2;

public class Main {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom message");
        } catch (CustomException e){
            e.printErrorMessage();
        }
    }
}
