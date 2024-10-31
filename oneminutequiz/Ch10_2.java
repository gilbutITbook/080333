package oneminutequiz;

import java.util.ArrayList;

public class Ch10_2 {
    public static void main(String[] args) {
        // ArrayList 생성
        ArrayList<Integer> numbers = new ArrayList<>();  // ①

        // 숫자 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // 리스트 크기 확인
        int size = numbers.size();  // ②
        System.out.println("리스트의 크기: " + size);

        // 요소 모두 출력
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("숫자: " + numbers.get(i));
        }

        // 특정 요소 삭제
        numbers.remove(1);  // ③
        System.out.println("요소를 삭제한 후 리스트: " + numbers);
    }
}
