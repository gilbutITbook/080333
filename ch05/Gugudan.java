package ch05;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        int value;
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 단을 출력할까요? (예: 3) "); // 단(정수) 입력받기
        int dan = scan.nextInt(); // 입력받은 단 저장
        for (int i = 1; i <= 9; i++) {
            value = dan * i;
            System.out.println(dan + " x " + i + " = " + value);
        }

    }
}
