package ch10.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // HashMap 객체 생성
        HashMap<String, Integer> map = new HashMap<>();

        // 항목 추가
        map.put("Apple", 10);
        map.put("Banana", 15);
        map.put("Cherry", 20);
        map.put("Durian", 25);

        // 키에 대응하는 값 가져오기
        System.out.println("Apple의 수량: " + map.get("Apple")); // Apple의 수량: 10

        // 키에 대응하는 항목 삭제
        map.remove("Banana");
        System.out.println("맵 상태: " + map); // {Apple=10, Orange=20, Grapes=25}

        // 특정 키가 존재하는지 확인
        System.out.println("Cherry가 있는가? " + map.containsKey("Cherry")); // true

        // 특정 값이 존재하는지 확인
        System.out.println("값이 10인 항목이 있는가? " +map.containsValue(10)); // true

        // 모든 키를 Set으로 가져오기
        Set<String> keys = map.keySet();
        System.out.println("모든 키: " + keys); // 모든 키: [Apple, Orange, Grapes]

        // 모든 값을 Collection으로 가져오기
        Collection<Integer> values = map.values();
        System.out.println("모든 값: " + values); // 모든 값: [10, 20, 25]

/*        // 모든 키-값 쌍을 Set으로 가져오기
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("모든 키-값 쌍: ");
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        // 모든 키-값 쌍:
        // Apple = 10
        // Orange = 20
        // Grapes = 25
        */
    }
}
