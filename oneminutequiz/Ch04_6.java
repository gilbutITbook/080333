package oneminutequiz;

import java.util.Scanner;

public class Ch04_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String grade = (num % 2 == 0) ? "짝수" : "홀수";
        System.out.println(grade);
    }

}
