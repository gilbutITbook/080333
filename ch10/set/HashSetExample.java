package ch10.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 객체 생성
        HashSet<String> fruits = new HashSet<>();

        // 요소 추가
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("집합 상태: " + fruits);

        // 중복 요소 추가
        fruits.add("Apple");

        // HashSet의 크기
        System.out.println("집합 크기: " + fruits.size()); // 출력: 3
        
        // 요소 존재 확인
        System.out.println("Banana가 있는가? " + fruits.contains("Banana")); // 출력: true
        // 요소 삭제
        System.out.println("Banana가 삭제됐는가? " + fruits.remove("Banana")); // 출력: true
        // Banana가 삭제된 후 존재 확인
        System.out.println("Banana가 있는가? " + fruits.contains("Banana")); // 출력: false
        // HashSet이 비어 있는지 확인
        System.out.println("집합이 비어 있는가? " + fruits.isEmpty()); // 출력: false

        // HashSet의 모든 요소 출력
        System.out.println("집합 요소:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // 출력: Apple, Orange (순서는 다를 수 있음)
        }

        // HashSet의 모든 요소 삭제
        fruits.clear();
        System.out.println("최종 집합 크기: " + fruits.size()); // 출력: 0

        // HashSet이 비어 있는지 확인
        System.out.println("집합이 비어 있는가? " + fruits.isEmpty()); // 출력: true
        //System.out.println("최종 집합 상태: " + fruits);

    }
}
