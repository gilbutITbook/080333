package ch11;

public class StdOutputStreamExample {
    public static void main(String[] args) {
        // 표준 출력 스트림을 통해 콘솔에 메시지 출력
        System.out.println("Hello, Java!");
        int a = 10;
        int b = 20;
        System.out.printf("%d와 %d의 합: %d%n", a, b, a + b); // 서식을 지정해 출력
    }
}
