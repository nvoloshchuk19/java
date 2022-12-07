package lesson12;

public class Main {
    public static void main(String[] args) {
        Predicate<String> str = String::isEmpty;
        System.out.println(str.isEmpty(""));

        Supplier<String> str1 = () -> "Hello";
        System.out.println(str1.get());


    }

    public interface Predicate<String> {
        boolean isEmpty(String s);
    }

    public interface Supplier<String> {
        String get();
    }

    public interface Function<String, n>{

    }

}
