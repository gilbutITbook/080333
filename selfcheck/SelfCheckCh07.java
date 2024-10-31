package selfcheck;

public class SelfCheckCh07 {
    public static void main(String[] args) {
        Person person = new Person("김길벗", 21);
        person.displayInfo();
        person.setName("이코천");
        person.setAge(22);
        System.out.println("수정한 이름: " + person.getName());
        System.out.println("수정한 나이: " + person.getAge());
    }
}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}

