package ch12;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0; // 람다식으로 구현
        System.out.println(isEven.test(1));
        System.out.println(isEven.test(2));
    }
}
