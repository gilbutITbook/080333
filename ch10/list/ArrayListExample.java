package ch10.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // 요소 접근
        System.out.println(list.get(1)); // Banana

        // 요소 수정
        list.set(1, "Durian");
        System.out.println(list.get(1)); // Durian

        // 요소 삭제
        list.remove(0); // Apple 삭제

        // 리스트 크기
        System.out.println("리스트 크기: " + list.size()); // 리스트 크기: 2

        // 리스트가 비었는지 확인
        System.out.println("리스트가 비었는가? " + list.isEmpty()); // 출력: Is empty: false

    }
}
