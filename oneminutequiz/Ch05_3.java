package oneminutequiz;

public class Ch05_3 {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 9){
            int j = 1;
            System.out.println("--- " + i + "단 ---");
            while (j <= 9) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }
            i++;
        }
    }
}
