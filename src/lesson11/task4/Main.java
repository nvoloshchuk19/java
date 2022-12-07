package lesson11.task4;

import lesson11.task2.CustomException;
import lesson11.task3.HelloWorld;

public class Main {
    public static void main(String[] args) {
        try {
            HelloWorld sayHi = new HelloWorld(null);
            System.out.println(sayHi.sayHelloWorld());
        } catch (CustomException e){
            e.printErrorMessage();
        }
    }
}
