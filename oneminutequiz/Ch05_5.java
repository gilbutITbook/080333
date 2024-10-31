package oneminutequiz;

public class Ch05_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
            break;
        }
    }
}
