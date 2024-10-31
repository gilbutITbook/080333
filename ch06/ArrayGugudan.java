package ch06;

public class ArrayGugudan {
    public static void main(String[] args) {
        int[][] gugudan = new int[9][9]; // 이차원 배열 생성
        for(int i = 0; i <= 8; i++) { // 단
            System.out.println("--- " + (i + 1) + "단 ---"); // 단 표시
            for(int j = 0; j <= 8; j++) { // 곱하는 수
                gugudan[i][j] = (i + 1) * (j + 1); // 배열에 곱한 값 저장
                System.out.println((i + 1) + " x " + (j + 1) + " = " + gugudan[i][j]);
            }
        }
    }
}
