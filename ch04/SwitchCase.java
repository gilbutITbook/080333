package ch04;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("점수를 입력하세요. ");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        switch (score) {
            case (100):
            case (99):
            case (98):
            case (97):
            case (96):
            case (95):
            case (94):
            case (93):
            case (92):
            case (91):
            case (90):
                System.out.println("A학점입니다.");
                //break;
            case (80):
                System.out.println("B학점입니다.");
                break;
            case (70):
                System.out.println("C학점입니다.");
                break;
            default:
                System.out.println("D학점입니다.");
                break;
        }

    }

}
