package lesson11.task3;

import lesson11.task2.CustomException;

public class HelloWorld {

    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    public String sayHelloWorld() throws CustomException {
        if (message == null) {
            throw new CustomException("Message is null!!!");

        }
        return message + " says Hello World!!!";
    }
}
