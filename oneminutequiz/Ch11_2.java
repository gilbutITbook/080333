package oneminutequiz;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ch11_2 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        try (FileOutputStream fos = new FileOutputStream("D:/output.txt")) {
            fos.write(data.getBytes());
            System.out.println("Writing completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }

/*        try {
            FileOutputStream fos = new FileOutputStream("D:/output.txt");
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Writing completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

}
