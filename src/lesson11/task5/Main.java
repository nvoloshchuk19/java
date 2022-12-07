package lesson11.task5;

import lesson11.task2.CustomException;

public class Main {
    public static void main(String[] args) throws CustomException {
        C classC = new C();
        System.out.println(((A) classC).throwException());
    }
}
