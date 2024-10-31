package ch11;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String data = "Hello, World!"; // 파일에 쓸 내용
        try {
            // 출력 스트림 생성, 지정한 파일이 없으면 생성함
            FileOutputStream fos = new FileOutputStream("D:/output.txt");
            // 문자열을 바이트 배열로 변환해 파일에 씀
            fos.write(data.getBytes());
            // 스트림 닫기
            fos.close();
            System.out.println("Writing completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
