package ch05;

public class DoWhileExample {
    public static void main(String[] args) {
        int value;
        int i = 1;
        do {
            value = 3 * i;
            System.out.println("3 x " + i + " = " + value);
            i++;
        } while (i <= 9);

/*
        int i = 1;
        while (i < 1) {
            System.out.println("while 문 " + i + "번째 실행");
            i++;
        }
        System.out.println("현재 i 변수의 값: " + i);
*/

/*
        int i = 1;
        do {
            System.out.println("do-while 문 " + i + "번째 실행");
            i++;
        } while (i < 1);
        System.out.println("현재 i 변수의 값: " + i);
*/

    }
}
