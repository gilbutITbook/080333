package ch11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        // BufferedReader 클래스를 함께 사용할 때
        try(BufferedReader br = new BufferedReader(
                new FileReader("D:/input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // BufferedReader 클래스를 사용하지 않을 때
/*         try (FileReader reader = new FileReader("D:/input.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
*/

    }
}
