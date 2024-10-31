package oneminutequiz;

class Person {
    // 일반 메서드
    public void introduce() {
        System.out.println("나는 학생입니다.");
    }
}

// 자식 클래스
class Student extends Person {
    @Override
    public void introduce() {
        System.out.println("대학교 1학년입니다.");
    }
}

public class Ch08_2 {
    public static void main(String[] args) {
        // 객체 생성
        Person person = new Person();
        Student student = new Student();
        person.introduce(); // 부모 클래스의 메서드 호출
        student.introduce(); // 객체의 메서드 호출
    }
}