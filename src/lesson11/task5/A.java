package lesson11.task5;

import lesson11.task2.CustomException;

public class A {
    public boolean throwException() throws CustomException {
        throw new CustomException("Class A exception");
    }
}
