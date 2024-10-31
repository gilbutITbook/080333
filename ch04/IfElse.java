package ch04;

public class IfElse {
    public static void main(String[] args) {
        int score = 80;
        if (score >= 90) {
            System.out.println("A학점입니다.");
        } else if (score >= 80 && score < 90) {
            System.out.println("B학점입니다.");
        } else if (score >= 70 && score < 80) {
            System.out.println("C학점입니다.");
        } else {
            //System.out.println("A학점이 아닙니다.");
            System.out.println("D학점입니다.");
        }
    }


}
