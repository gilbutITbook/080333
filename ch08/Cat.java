package ch08;

// Animal 클래스 상속
public class Cat extends Animal {
    // Cat 클래스에만 있는 메서드
    public void rub() {
        System.out.println(name + "가 몸을 비빕니다.");
    }

/*
    // 8.2.1 메서드 오버라이딩
    @Override
    public void eat() {
        System.out.println(name + "가 닭고기를 먹습니다.");
    }
*/


    // 8.2.4 super

    @Override
    public void eat() {
        super.eat(); // 부모 클래스의 eat() 메서드 호출
        System.out.println(name + "가 닭고기를 먹습니다.");
    }
   // Cat 클래스의 생성자
    public Cat(String name, int age) {
        super(name, age);
    }
}
