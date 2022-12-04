package lesson11.task5;

import lesson11.task2.CustomException;

public class B extends A{
    @Override
    public boolean throwException() throws CustomException {
        throw new CustomException("Class B exception");
    }
}
