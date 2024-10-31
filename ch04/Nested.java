package ch04;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {
        System.out.println("학년을 입력하세요.");
        Scanner scanGrade = new Scanner(System.in);
        int grade = scanGrade.nextInt(); // 학년 입력받기
        if (grade == 4) { // 4학년일 때
            System.out.println("점수를 입력하세요.");
            Scanner scanScore= new Scanner(System.in);
            int score = scanScore.nextInt(); // 점수 입력받기
            if (score >= 90 ) { // 90 점 이상
                System.out.println("장학금 지급 대상입니다.");
            } else { // 90점 미만
                System.out.println("장학금 지급 대상이 아닙니다.");
            }
        } else { // 4학년이 아닐 때
            System.out.println("장학금 지급 학년이 아닙니다");
        }
    }

}
