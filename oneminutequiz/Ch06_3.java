package oneminutequiz;

public class Ch06_3 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        copy[3] = 99;
        System.out.println(original[3]);
    }
}
