package ch04;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요. (예: 95, 90, 85, 80)");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        String grade = (input >= 90) ? "A" : "B";
        System.out.println(grade + "학점입니다.");
/*
        if (input >= 90){
            System.out.println("A학점입니다.");
        } else {
            System.out.println("B학점입니다.");
        }
        */

    }
}
