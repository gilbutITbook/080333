package oneminutequiz;

// 추상 클래스 AbstractPerson 선언
abstract class AbstractPerson {
    String name;
    int age;
    // 생성자
    public AbstractPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 추상 메서드 선언
    public abstract void introduce();
}

// AbstractStudent 클래스는 AbstractPerson 클래스를 상속받음
class AbstractStudent  extends AbstractPerson {
    int grade;

    // 생성자
    public AbstractStudent(String name, int age, int grade) {
        super(name, age); // 부모 클래스의 생성자 호출
        this.grade = grade;
    }
    // introduce 메서드 구현
    @Override
    public void introduce() {
        System.out.println("안녕! 내 이름은 " + name + "고, 나이는 " + age + "살이야.");
    }
    // 자식 클래스만의 새로운 메서드
    public void gradeInfo() {
        System.out.println("현재 " + grade + "학년이야.");
    }
}

public class Ch08_4 {
    public static void main(String[] args) {
        // 추상 클래스로는 객체를 생성할 수 없음, 컴파일 오류
        // AbstractPerson student1 = new AbstractPerson("이코천", 20, 1);
        AbstractStudent student = new AbstractStudent("김길벗", 21, 2);
        // AbstractPerson 타입 변수로는 AbstractStudent 클래스에 새로 정의한 메서드에 접근할 수 없음
        // student1.introduce();
        // student1.gradeInfo();
        student.introduce();
        student.gradeInfo();
   }
}