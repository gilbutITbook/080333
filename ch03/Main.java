package ch03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a; // 변수 선언
        int b = 10; // 변수 선언 및 초기화
        a = 11; // 변수 초기화
        System.out.println(a);
        System.out.println(b);


        System.out.printf("이름: %s ", "코천이");
        System.out.printf("나이: %d ", 21);
        System.out.printf("취미: %s ", "코딩");

        System.out.printf("이름: %s%n", "코천이");
        System.out.printf("나이: %d\n", 21);
        System.out.printf("취미: %s", "코딩");

        System.out.printf("이름: %s%n나이: %d\n취미: %s", "코천이", 21, "코딩");

        System.out.printf("%7d%n", 11111);
        System.out.printf("%-7d%n", 11111);
        System.out.printf("%07d%n", 11111);
        System.out.printf("%,7d%n", 11111);

        System.out.printf("%.4f", 123.45f);

        System.out.println(100 + 3);
        System.out.println(100 - 3);
        System.out.println(100 * 3);
        System.out.println(100 / 3);

        //int a = 100;
        //int b = 3;
        int add = a + b;
        int sub = a - b;
        int mul= a * b;
        int div = a / b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        System.out.println("123" + 4);
        System.out.println(123 + 4);

        System.out.println("123" + "456");
        System.out.println("abc" + "efgh");
        System.out.println("코딩" + "자율학습");

        int age = 21;
        System.out.println("나는 올해 " + age + "살입니다.");

        Scanner scan = new Scanner(System.in);
        /*int a = scan.nextInt();
        int b = scan.nextInt();
        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        // int div = a / b;
        // float div = (float)a / (float)b; // float형으로 변환
        double div = (double)a / (double)b; // double형으로 형변환*/
        System.out.println("덧셈 결과: " + add);
        System.out.println("뺄셈 결과: " + sub);
        System.out.println("곱셈 결과: " + mul);
        System.out.println("나눗셈 결과: " + div);

        int num1 = 12;
        float num2 = 12.3F;
        int result = num1 + (int)num2;
        //float result = num1 + num2;
        System.out.println(result);

    }

}
