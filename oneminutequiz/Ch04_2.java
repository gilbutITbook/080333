package oneminutequiz;

import java.util.Scanner;

public class Ch04_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 1) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
    }
}
