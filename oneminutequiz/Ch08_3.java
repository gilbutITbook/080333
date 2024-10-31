package oneminutequiz;

class Person2 {
    String name;
    int age;
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce() {
        System.out.println("안녕! 내 이름은 " + name + "이고, 나이는 " + age + "살이야.");
    }
}
class Student2 extends Person2 {
    int grade;
    public Student2(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public void gradeInfo() {
        System.out.println("현재 대학교 " + grade + "학년이야");
    }
}
public class Ch08_3 {
    public static void main(String[] args) {
        Student2 student = new Student2("이코천", 20, 1);
        student.introduce();
        student.gradeInfo();
    }
}
