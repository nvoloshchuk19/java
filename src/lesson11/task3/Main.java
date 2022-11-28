package lesson11.task3;

import lesson11.task2.CustomException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new CustomException();
        } catch (CustomException e){
            e.printErrorMessage();
        }
    }
}
