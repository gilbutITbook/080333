package ch09;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) {
        try {
            readFile("C:/example.txt"); // 파일 읽기 메서드 호출
        } catch (IOException e) {
            System.out.println(e); // 예외 발생 시 예외 내용 출력
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
    // 예외 처리를 호출한 곳으로 미룸
    // 파일 읽기 메서드
    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }


}
