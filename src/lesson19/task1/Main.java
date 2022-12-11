package lesson19.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileWriter myWriter = new FileWriter("test.txt")) {
            myWriter.write("Hello Hi world");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        File myObj = new File("test.txt");
        try (Scanner myReader = new Scanner(myObj)) {
            String result = "";
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] text = data.split(" ");
                for (String s : text) {
                    if (s.length() < 5) {
                        result += s;
                    }
                }
            }
            FileWriter myWriter1 = new FileWriter("test.txt");
            myWriter1.write(result);
            myWriter1.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
