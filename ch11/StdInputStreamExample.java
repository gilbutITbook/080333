package ch11;

import java.util.Scanner;

public class StdInputStreamExample {
    public static void main(String[] args) {
        // Scanner 객체를 사용해 표준 입력 스트림으로부터 데이터를 읽어옴
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요.--> ");
        String name = scanner.nextLine(); // 사용자 입력을 문자열로 읽어들임
        System.out.println("안녕, " + name + "!");
    }
}
