package ch05;

import java.util.Scanner;

public class ImprovedGugudan {
    public static void main(String[] args) {
        System.out.println("**** 구구단 프로그램을 시작합니다. ****");
        System.out.println("종료하려면 '0'을 입력하세요."); // 반복문 탈출 조건 설정
        while (true) { // 무한 반복문
            int value;
            Scanner scan = new Scanner(System.in);
            System.out.print("몇 단을 출력할까요? (예: 3) "); // 단 입력받기
            int dan = scan.nextInt(); // 입력받은 단 저장
            if (dan == 0) { // 0을 입력받으면
                break; // 반복문 탈출
            }
            for (int i = 1; i <= 9; i++) {
                value = dan * i;
                System.out.println(dan + " x " + i + " = " + value);
            }
        }
        System.out.println("**** 구구단 프로그램을 종료합니다. ****");

    }
}
