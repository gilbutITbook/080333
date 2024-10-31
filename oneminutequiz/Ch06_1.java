package oneminutequiz;

public class Ch06_1 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        int value = 10;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = value * (i + 1);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        int[][] matrix = new int[3][3];
/*        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        */
        int x = 1; // int x = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = x;
                x++; // 초깃값이 0일 때는 ++x로 작성
            }
        }
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
     // for(int i = 0; i < 3; i++) {
     //     for(int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+ " "); // 값 구분을 위해 공백 추가
            }
            System.out.println(""); // 행 구분을 위해 줄 바꿈 추가
        }

    }
}
