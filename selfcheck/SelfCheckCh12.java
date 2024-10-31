package selfcheck;

import java.util.ArrayList;
import java.util.function.Predicate;

// 12장 셀프체크 문제가 다음과 같이 변경됐습니다.
/*
다음 조건에 맞는 코드를 작성하세요.

----조건----
1. ArrayList로 numbers 리스트를 생성하고 1부터 6까지 요소로 추가합니다.
2. Predicate 인터페이스로 값이 짝수인지 아닌지 판별하는 람다식을 작성합니다.
3. filterList() 메서드를 사용해 numbers 리스트에서 짝수만 필터링하고 결과를 evenNumbers 리스트에 담아 다음과 같이 출력합니다.
<실행결과>
짝수만 필터링한 결과: [2, 4, 6]
</실행결과>
 4. filterList() 메서드는 다음과 같습니다. 이 메서드는 리스트와 조건을 인수로 받아 조건에 맞는 요소들만 리스트로 반환합니다.
<코드>
public static ArrayList<Integer> filterList(ArrayList<Integer> list,
                                            Predicate<Integer> predicate) {
    ArrayList<Integer> filteredList = new ArrayList<>();
    for (Integer num : list) {
        if (predicate.test(num)) {
            filteredList.add(num);
        }
    }
    return filteredList;
}
<코드>
----<조건 끝>---
*/

public class SelfCheckCh12 {
    public static void main(String[] args) {
        // 리스트를 생성하고 1~6 추가
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        // Predicate 인터페이스로 짝수인지 판별하는 람다식 정의
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        // 짝수만 필터링한 결과를 담을 리스트 생성
        ArrayList<Integer> evenNumbers = filterList(numbers, isEven);
        // 결과 출력
        System.out.println("짝수만 필터링한 결과: " + evenNumbers);
    }
    // 리스트를 받아 조건에 맞는 요소들만 반환하는 메서드
    public static ArrayList<Integer> filterList(ArrayList<Integer> list,
                                                Predicate<Integer> predicate) {
        ArrayList<Integer> filteredList = new ArrayList<>();
        for (Integer num : list) {
            if (predicate.test(num)) { // 조건에 맞는지 검사
                filteredList.add(num); // 필터링한 결과 리스트에 담기
            }
        }
        return filteredList; // 필터링 결과 리스트 반환
    }
}
