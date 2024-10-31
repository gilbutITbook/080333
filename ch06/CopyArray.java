package ch06;

public class CopyArray {
    public static void main(String[] args) {
/*        int[] originArray = {1, 2, 3};
        int[] copyArray = originArray;
        System.out.println(copyArray[0]); // 1
        System.out.println(copyArray[1]); // 2
        System.out.println(copyArray[2]); // 3*/

        int[] originArray = {1, 2, 3};
        int[] deepCopyArray = new int[originArray.length];
        for(int i = 0; i < originArray.length; i++) {
            deepCopyArray[i] = originArray[i];
        }
        deepCopyArray[0] = 10;
        System.out.println(originArray[0]); // 1 출력


    }
}
