package oneminutequiz;

import java.util.Scanner;

public class Ch04_4 {
    public static void main(String[] args) {
        System.out.println("양수를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); // 숫자 입력받기
        if (num > 0) { // num이 양수인가?
            if (num % 2 == 1) { // num이 홀수인가?
                System.out.println("홀수");
            } else {
                System.out.println("짝수");
            }
        } else {
            System.out.println("양수가 아닙니다. 양수를 입력하세요.");
        }
    }

}
