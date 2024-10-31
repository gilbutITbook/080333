package oneminutequiz;

interface PersonInterface {
    void introduce();
}

// AbStudent 클래스는 PersonInterface 인터페이스를 구현
class StudentInterface implements PersonInterface {
    String name;
    int age;
    int grade;

    // 생성자
    public StudentInterface(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // introduce 메서드 구현
    @Override
    public void introduce() {
        System.out.println("안녕! 내 이름은 " + name + "고, 나이는 " + age + "살이야.");
    }

    // AbStudent 클래스만의 새로운 메서드
    public void gradeInfo() {
        System.out.println("현재 대학교 " + grade + "학년이야.");
    }
}

public class Ch08_5 {
    public static void main(String[] args) {
        StudentInterface student = new StudentInterface("이코천", 20, 1);
        student.introduce();
        student.gradeInfo();
    }
}