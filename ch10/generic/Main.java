package ch10.generic;

public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>(); // String 타입의 Box 객체 생성
        box.setContent("Hello, World!"); // 문자열 저장
        String content = box.getContent(); // 타입 캐스팅 불필요
        System.out.println(content);
        // 잘못된 타입으로 캐스팅 시 컴파일 오류 발생
        //Integer number = (Integer)box.getContent(); // 컴파일 오류 발생

/*        Box box = new Box(); // Box 객체 생성
        box.setContent("Hello, World!"); // 문자열 저장
        Integer number = (Integer)box.getContent(); // Integer형으로 변환
        System.out.println(number);
        */

    }
}
