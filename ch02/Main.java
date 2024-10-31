package ch02;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("Hello");
        System.out.print("Java");

        System.out.print("Hello\n");
        System.out.print("Java\n");

        System.out.println("Hello");
        System.out.println("Java");

        System.out.println((char)System.in.read());

        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextLine());
        System.out.println(scan.next());
        scan.close();
    }
}
