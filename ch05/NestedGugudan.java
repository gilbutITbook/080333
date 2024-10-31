package ch05;

public class NestedGugudan {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) { // 2단부터 9단까지 반복
            int value;
            System.out.println("--- " + i + "단 ---"); // 단 표시
            for (int j = 1; j <= 9; j++) { // 곱하는 수
                // System.out.println(i + " x " + j + " = " + (i * j));
                value = i * j;
                System.out.println(i + " x " + j + " = " + value);
            }
        }
    }
}
