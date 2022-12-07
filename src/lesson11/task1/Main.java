package lesson11.task1;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Error");
        } catch (Exception e) {
            System.out.println("Catch block: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block: We were here");
        }
    }
}
