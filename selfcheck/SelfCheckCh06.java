package selfcheck;

public class SelfCheckCh06 {
    public static void main(String[] args) {
        // 학생 3명의 4과목 점수를 저장하는 이차원 배열 생성
        int[][] scoreArray = {
                {85, 70, 90, 95}, // 학생 1의 성적
                {80, 95, 90, 75}, // 학생 2의 성적
                {75, 85, 90, 80} // 학생 3의 성적
        };
        // 학생 성적 및 평균 계산 출력
        System.out.println("학생들의 성적은 다음과 같습니다.");
        for (int i = 0; i < scoreArray.length; i++) {
            int sum = 0;
            System.out.print("학생 " + (i + 1) + ": "); // 학생 번호 출력
            for (int j = 0; j < scoreArray[i].length; j++) {
                System.out.print(scoreArray[i][j] + " "); // 각 과목 점수 출력
                sum += scoreArray[i][j]; // 총점
            }
            double average = (double)sum / scoreArray[i].length; // 평균 계산
            System.out.println("| 평균: " + average); // 평균 출력
        }
    }
}
