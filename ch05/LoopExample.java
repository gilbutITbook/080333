package ch05;

import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (;;) {
            System.out.println("숫자를 무한 반복해서 더하는 중입니다. ");
            System.out.print("숫자를 입력하세요. -> ");
            int input = scanner.nextInt();
            sum = sum + input;
            System.out.println("결과: " + sum);
        }
        */

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("숫자를 무한 반복해서 더하는 중입니다. ");
            System.out.print("숫자를 입력하세요. -> ");
            int input = scanner.nextInt();
            sum = sum + input;
            System.out.println("결과: " + sum);
        }

    }
}
