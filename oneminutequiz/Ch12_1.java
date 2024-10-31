package oneminutequiz;

import java.util.Scanner;

public class Ch12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("나이를 입력하세요: ");
            int age = Integer.parseInt(scanner.nextLine());
            if (age < 0 || age > 100) {
                throw new IllegalArgumentException("나이는 0보다 크고 100보다 작아야 합니다.");
            }
            System.out.println("입력된 나이: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("프로그램이 종료됩니다.");
        }
        
    }
}
