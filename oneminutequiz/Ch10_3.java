package oneminutequiz;


import java.util.HashSet;
import java.util.Iterator;

public class Ch10_3 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();  // ①

        // 요소 추가
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2); // 중복 요소 추가

        // HashSet 크기 확인
        System.out.println("집합 크기: " + numbers.size());

        // 특정 요소 포함 여부 확인
        if (numbers.contains(3)) {  // ②
            System.out.println("3이 포함돼 있습니다.");
        } else {
            System.out.println("3이 포함돼 있지 않습니다.");
        }

        // 반복자를 이용해 모든 요소 출력
        Iterator<Integer> iterator = numbers.iterator();  // ③
        System.out.println("집합 요소: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 모든 요소 제거
        numbers.clear();
        System.out.println("집합이 비어 있는가? " + numbers.isEmpty()); // ④
    }
}
