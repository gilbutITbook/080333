package ch10.list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList 객체 생성
        LinkedList<String> list = new LinkedList<>();

        // 요소 추가
        list.addFirst("Apple");   // 리스트의 첫 번째 위치에  추가
        list.addLast("Banana");   // 리스트의 마지막 위치에  추가
        list.push("Cherry");     // 리스트의 첫 번째 위치에 추가

        // 리스트 상태 출력
        System.out.println("리스트 상태: " + list);
        // 첫 번째 요소 접근
        System.out.println("첫 번째 요소: " + list.getFirst());

        // 요소 삭제
        list.pop();  // 리스트의 첫 번째 요소 삭제
        System.out.println("리스트 상태: " + list);

        list.removeLast();  // 리스트의 마지막 요소 삭제
        System.out.println("리스트 상태: " + list);

        list.addLast("Durian");  // 리스트의 마지막 위치에 추가
        System.out.println("리스트 상태: " + list);

        list.pop();  // 리스트의 첫 번째 요소 삭제
        System.out.println("리스트 상태: " + list);

        System.out.println("첫 번째 요소: " + list.getFirst());  // 리스트의 첫 번째 요소 반환
        System.out.println("최종 리스트: " + list);
    }
}