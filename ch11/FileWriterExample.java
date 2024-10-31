package ch11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(
                new FileWriter("D:/output.txt", true))) {
            // 문자열을 파일에 쓰기 (append 모드)
            // 줄바꿈 추가
            writer.newLine();
            writer.write("Hello, Java!");
            // 줄바꿈 추가
            writer.newLine();
            // 추가 문자열 쓰기
            writer.write("This is another line.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
