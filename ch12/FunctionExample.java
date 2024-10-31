package ch12;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, String> upperCase = (str) -> str.toUpperCase();
        System.out.println(upperCase.apply("Hello world"));
    }
}
