package oneminutequiz;

public class Ch04_3 {
    public static void main(String[] args) {
        int score = 80;
        if (score >= 90) {
            System.out.println("A학점입니다.");
        } else if (score >= 80 ) { // 90점 이하
            System.out.println("B학점입니다.");
        } else if (score >= 70) { // 80 점 이하
            System.out.println("C학점입니다.");
        } else {
            System.out.println("D학점입니다.");
        }
    }
}
