package ch12;

public class LambdaExample {
    public static void main(String[] args) {
        // 추상 메서드를 람다식으로 구현한 후 Check 인터페이스형 참조 변수에 할당
        Check even = n -> n % 2 == 0 ? true : false;
        System.out.println(even.isEven(15)); // 변수로 isEven() 메서드 접근
    }
}
