package ch08;

public class Animal {
    // 필드
    String name;
    int age;

    // 메서드
    public void eat() {
        System.out.println(name + "가 밥을 먹습니다.");
    }


    // 8.2.4 super
    // 부모 클래스의 생성자
    // String name = "동물";

    // 부모 생성자
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("이름: " + this.name + "\n나이: " + this.age);
    }

/*
    public void printName() {
        System.out.println("부모 클래스의 name: " + name);
    }
*/



}


