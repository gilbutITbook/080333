package oneminutequiz;

interface CalculatorInterface {
    int operate(int a, int b); // 두 정수를 받아서 계산하는 추상 메서드 선언
}

public class Ch12_2 {
    public static void main(String[] args) {
        // ① 람다식을 사용해 add 변수에 할당
        CalculatorInterface add = (a, b) -> a + b;
        // ② add 변수로 operate() 메서드를 호출해 결과 출력
        int result = add.operate(10, 20);
        System.out.println("결과: " + result);
    }
}