package selfcheck;

import java.util.Scanner;

public class SelfCheckCh04 {
    public static void main(String[] args) {
        System.out.print("알파벳 소문자를 입력하세요. --> ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        switch (str) {
            case "a":
                System.out.println("A");
                break;
            case "b":
                System.out.println("B");
                break;
            case "c":
                System.out.println("C");
                break;
            default:
                System.out.println("일치하는 알파벳이 없습니다.");
        }
        scan.close();
    }
}

