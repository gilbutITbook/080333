package oneminutequiz;

class Calculator {
    public static int count = 0;
    public static int add(int a, int b) {
        count++;
        return a + b;
    }
    public void printCount() {
        System.out.println("메서드가 " + count + "번 호출됐습니다.");
    }
}
public class Ch07_2 {
    public static void main(String[] args) {
        int result1 = Calculator.add(5, 10);
        int result2 = Calculator.add(3, 7);
        System.out.println("호출 횟수: " + Calculator.count);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        Calculator calculator = new Calculator();
        calculator.printCount();
    }
}
