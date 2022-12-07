package lesson11.task2;

public class CustomException extends Exception{
    private String message;
    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    public void printErrorMessage(){
        System.out.println(message);
    }
}
