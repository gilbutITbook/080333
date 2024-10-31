package selfcheck;


import java.util.Scanner;

public class SelfCheckCh03 {
    public static void main(String[] args) {
        // Scanner 클래스로 입력받기
        Scanner scan = new Scanner(System.in);
        // 정수 입력받기
        System.out.print("정수를 입력하세요. --> ");
        int intValue = scan.nextInt();
        // 실수 입력받기
        System.out.print("실수를 입력하세요. --> ");
        double doubleValue = scan.nextDouble();
        // 사칙연산 수행
        int sum = intValue + (int)doubleValue;               // 덧셈 (실수를 정수로 강제 형변환)
        double difference = (double)intValue - doubleValue;  // 뺄셈 (정수를 실수로 강제 형변환)
        double product = (double)intValue * doubleValue;     // 곱셈 (정수를 실수로 강제 형변환)
        int quotient = intValue / (int)doubleValue;          // 나눗셈 (실수를 정수로 강제 형변환)
        // 결과 출력
        System.out.println("덧셈 결과(정수): " + sum);
        System.out.println("뺄셈 결과(실수): " + difference);
        System.out.println("곱셈 결과(실수): " + product);
        System.out.println("나눗셈 결과(정수): " + quotient);
        scan.close();
    }
}
