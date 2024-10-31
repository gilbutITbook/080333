package selfcheck;

import java.util.Scanner;

public class SelfCheckCh05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 0; // 잔액
        System.out.println("**** 자판기 프로그램을 시작합니다. ****");
        // 조건이 참일 동안 반복
        while (true) {
            System.out.println("\n현재 투입 금액: " + balance + "원");
            System.out.println("1. 콜라 (1,500원)\n2. 오렌지주스 (2,000원)");
            System.out.println("3. 생수 (1,000원)\n4. 종료");
            System.out.print("음료를 고르세요. (번호 입력): ");
            int choice = scan.nextInt();
            // 번호 선택 시
            switch (choice) {
                case 1:
                    if (balance >= 1500) {
                        balance = balance - 1500;
                        System.out.println("콜라를 선택했습니다. 남은 금액: " + balance + "원\n");
                    } else {
                        System.out.println("금액이 부족합니다. 돈을 더 투입하세요.\n");
                    }
                    break;
                case 2:
                    if (balance >= 2000) {
                        balance = balance - 2000;
                        System.out.println("오렌지주스를 선택했습니다. 남은 금액: " + balance + "원\n");
                    } else {
                        System.out.println("금액이 부족합니다. 돈을 더 투입하세요.");
                    }
                    break;
                case 3:
                    if (balance >= 1000) {
                        balance = balance - 1000;
                        System.out.println("생수를 선택했습니다. 남은 금액: " + balance + "원\n");
                    } else {
                        System.out.println("금액이 부족합니다. 돈을 더 투입하세요.");
                    }
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    scan.close(); // 스트림 닫기
                    return; // 프로그램 종료를 위해 추가
                default:
                    System.out.println("잘못된 번호입니다. 다시 선택해주세요.");
            }
            // 금액 투입 안내
            System.out.print("돈을 투입하세요. (0을 입력하면 메뉴로 돌아갑니다.): ");
            int money = scan.nextInt(); // 투입 금액
            if (money > 0) {
                balance += money; // 잔액 + 투입 금액
            } else {
                System.out.println("메뉴로 돌아갑니다.\n");
            }
        }
    }
}
