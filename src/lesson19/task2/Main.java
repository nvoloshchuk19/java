package lesson19.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        try (FileWriter myWriter = new FileWriter("date.txt")) {
            myWriter.write(String.valueOf(LocalDateTime.now()));
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
