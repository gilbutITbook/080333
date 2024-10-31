package ch05;

public class WhileExample {
    public static void main(String[] args) {
        int value;
        int i = 1;
        while (i <= 9) {
            value = 3 * i;
            System.out.println("3 x " + i + " = " + value);
            i++;
        }
    }
}
