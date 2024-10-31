package selfcheck;

import java.io.*;

public class SelfCheckCh11 {
    public static void main(String[] args) {
        // try-with-resources 문법 사용
        // 읽기용 버퍼와 쓰기용 버퍼 생성
        try (BufferedReader br = new BufferedReader(new FileReader("D:/inputTest.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("D:/outputTest.txt"))) {
            String line;
            // inputTest.txt에서 한 줄씩 읽어와 outputTest.txt에 쓰기
            while((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine(); // 줄 바꿈 추가
            }
            System.out.println("File copy completed."); // 완료 메시지
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
